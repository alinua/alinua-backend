/**
 * 
 */
package org.alinua.configurations;

import java.util.Properties;

import javax.sql.DataSource;

import org.alinua.service.UserService;
import org.alinua.service.impl.UserServiceImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityView;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

/**
 * This class configures Spring MVC View Resolvers.
 * Spring MVC Configuration required for dispatcher servlet to create handlers, and view resolvers.
 * 
 * The @Configuration annotation is required for any Java-based configuration in Spring
 * 
 * @author Yannick ADECHI
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan( "org.alinua.controllers")
public class WebConfig extends WebMvcConfigurerAdapter{

	/**
	 * 
	 * Velocity is deprecated because it will probably be removed in Spring 5
	 * @return velocityConfigurer
	 */
	@SuppressWarnings("deprecation")
	@Bean
    public VelocityConfigurer velocityConfig() {
        VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
        velocityConfigurer.setResourceLoaderPath("/WEB-INF/");
        return velocityConfigurer;
    }
	
	
	@SuppressWarnings("deprecation")
	@Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        VelocityViewResolver viewResolver = new VelocityViewResolver();
         
        viewResolver.setViewClass(VelocityView.class);
        viewResolver.setCache(true);
        viewResolver.setPrefix("");
        viewResolver.setSuffix(".html");
        viewResolver.setExposeSpringMacroHelpers(true);
 
        registry.viewResolver(viewResolver);
    }
	
	/*@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/alinua-frontend/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}*/
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/");	
	}
	
}
