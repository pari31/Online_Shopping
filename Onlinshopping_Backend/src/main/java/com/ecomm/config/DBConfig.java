package com.ecomm.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={ "com.ecomm"})
@EnableTransactionManagement
public class DBConfig {

	private static final String DB_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:tcp://localhost/~/Onlineshopping";
	private static final String DB_USERNAME = "sa";
	private static final String DB_PASSWORD = "";
	private static final String DB_DIALECT = "org.hibernate.dialect.H2Dialect";

	// Step1:Creating H2 DataSource Bean is an instance of defined function which
	// can be called by its name

	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DB_DRIVER);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername(DB_USERNAME);
		dataSource.setPassword(DB_PASSWORD);

		System.out.println("---DataSource object is created---");
		return dataSource;
	}

	// Step2:Bean creation of sessionFactory which is to be linked by @Autowired and
	// object name(sessionFactory)

	@Bean(name = "sessioFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder lsfb = new LocalSessionFactoryBuilder(dataSource);
		// lsfb.addAnnotatedClass(Category.class);
		lsfb.scanPackages("com.ecomm");
		lsfb.addProperties(getHibernateProperties());

		System.out.println("---SessionFactory object is created---");
		return lsfb.buildSessionFactory();

	}

	// Puttting Hibernate properties in the Properties object

	private Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.dialect", DB_DIALECT);
		prop.put("hibernate.hbm2ddl.auto", "update"); //create ,create-drop,update,validate
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.format_sql", "true");

		return prop;

	}

	 

//Step3:Creating Tansaction Manager bean which is to be called by annotation @Transactional
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)

	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		
		System.out.println("---TransactionManager object is created---");
		return transactionManager;
	}

}
