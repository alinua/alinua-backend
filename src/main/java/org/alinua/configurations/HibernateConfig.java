/**
 * 
 */
package org.alinua.configurations;

import java.util.Properties;

import javax.sql.DataSource;

import org.alinua.dao.UserDAO;
import org.alinua.dao.impl.UserDAOImpl;
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

/**
 * Class that establishes all database connection settings 
 * Using the Spring annotations
 * 
 * @author Yannick ADECHI
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan( "org.alinua.configurations")
@PropertySource( value = { "classpath:applications.properties"})
public class HibernateConfig {

	@Autowired
	private Environment environment;
	
	
	/**
	 * Initialize SessionFactory Bean
	 * 
	 * @return LocalSessionFactoryBean
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "org.alinua.beans" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;		
	}
	
	
	/**
	 * Initialize dataSource
	 * 
	 * @return DataSource
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
	}
	
	
	/**
	 * Set Hibernate Properties
	 * 
	 * @return Properties
	 */
	private Properties hibernateProperties() {
		Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        return properties;
	}
	
	
	/**
	 * Initialize HibernateTransactionManager with SessionFactory
	 * 
	 * @param SessionFactory
	 * 
	 * @return HibernateTransactionManager
	 */
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionF) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
	       txManager.setSessionFactory(sessionF);
	       return txManager;
	}
	
	
	/*@Autowired
	@Bean(name = "UserService")
	public UserService getUserService(){
		return new UserServiceImpl();
	}*/
}
