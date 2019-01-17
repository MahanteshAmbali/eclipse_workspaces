package org.spring.hib;

import java.util.Properties;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

public class Manager1 {

	public static void main(String[] args) throws Exception {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("spring_jdbc");
		ds.setPassword("spring_jdbc");
		
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(ds);
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.connection.autocommit", "true");
		
		localSessionFactoryBean.setHibernateProperties(properties);
		
		localSessionFactoryBean.setMappingResources("org/spring/hib/Person.hbm.xml");
	
		localSessionFactoryBean.afterPropertiesSet();
		
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(localSessionFactoryBean.getObject());
		hibernateTemplate.setCheckWriteOperations(false);
		hibernateTemplate.afterPropertiesSet();
		
		Person person = new Person();
		person.setId(101);
		person.setFirstName("Mahantesh");
		person.setLastName("Ambali");
		person.setAge(20);
		
		hibernateTemplate.save(person);
		System.out.println("Done");
		
	}

}
