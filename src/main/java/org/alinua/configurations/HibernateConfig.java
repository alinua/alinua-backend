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
 * This class configures Spring Application Context using Java-based Configuration
 * It configures beans definitions using Java code instead of XML.
 * 
 * The @Configuration annotation is required for any Java-based configuration in Spring
 * The @EnableTransactionManager annotation enables Spring’s annotation-driven transaction management capability
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
	 * This method initializes a SessionFactory bean
	 * 
	 * For Java-based configuration, 
	 * Spring provides the LocalSessionFactoryBuilder 
	 * that facilitates the creation of Hibernate’s SessionFactory
	 * 
	 * @return nFactorysessio
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
	 * This method configures a DataSource to be used with Hibernate’s SessionFactory
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
	 * This method is for automatic transaction support for the SessionFactory
	 * 
	 * By configuring a transaction manager, 
	 * code in the DAO classes doesn’t have to 
	 * take care of transaction management explicitly.
	 * 
	 * Instead, the @Transactional annotation is used 
	 * to tell Spring automatically inserts transaction management code 
	 * into the bytecode.
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
	
}
