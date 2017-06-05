/**
 * 
 */
package org.alinua.configurations;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * We will not use web.xml. Spring provides WebApplicationInitializer interface
 * It detects the class automatically and intializes Dispatcher Servlet.
 * 
 * @author Yannick ADECHI
 */
public class WebInit implements WebApplicationInitializer {

	/**
	 * onStartup() method is invoked when the Servlet container initializes the application. 
	 * This method creates Spring Dispatcher Servlet dynamically to handle all requests 
	 * coming through the application.
	 * 
	 * 
	 *  The Spring Dispatcher Servlet takes an AnnotationConfigWebApplicationContext 
	 *  which is responsible for Spring-related initializations using annotations.
	 *  The classes that do the configurations are 
	 *  {@link org.alinua.configurations.HibernateConfig} & {@link org.alinua.configurations.WebConfig}
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(HibernateConfig.class);
		webContext.register(WebConfig.class);
		webContext.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}

}
