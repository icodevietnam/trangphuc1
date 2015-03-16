package com.icoding.trangphuc.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@PropertySource("classpath:jdbc.properties")
@Configuration
@EnableTransactionManagement
public class HibernateConfig {

	private @Value("${database.driver}") String driver;
	private @Value("${database.url}") String url;
	private @Value("${database.username}") String username;
	private @Value("${database.password}") String password;
	private @Value("${database.dialect}") String dialect;
	private @Value("${database.show_sql}") String showSql;
	private @Value("${database.hbm2ddl.auto}") String hbm2dll;
	private @Value("${database.flushmode}") String flushMode;

	@Autowired
	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory
				.setPackagesToScan(new String[] { "com.icoding.trangphuc.domain" });
		sessionFactory.setHibernateProperties(getHibernateProperties());
		return sessionFactory;
	}

	public Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.flushmode", flushMode);
		prop.put("hibernate.show_sql", showSql);
		prop.put("hibernate.dialect", dialect);
		prop.put("hibernate.flushmode", flushMode);
		return prop;
	}

	@Bean(name = "dataSource")
	public BasicDataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}

	// Create transaction manager
	@Bean
	public HibernateTransactionManager txManager() {
		return new HibernateTransactionManager(sessionFactory().getObject());
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
