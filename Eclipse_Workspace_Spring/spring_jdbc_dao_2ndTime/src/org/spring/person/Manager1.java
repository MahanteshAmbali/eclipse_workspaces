package org.spring.person;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class Manager1 {

	public static void main(String[] args) {

		PersonDAOImpl personDAOImpl = new PersonDAOImpl();
		
		JdbcTemplate jdbcTemplate = Util.getJdbcTemplate("jdbcTemplate");
		personDAOImpl.setJdbcTemplate(jdbcTemplate);
		
		//personDAOImpl.setup();
		
//		personDAOImpl.save(1, "Mahantesh", 29);
//		personDAOImpl.save(2, "asdf", 34);
//		personDAOImpl.save(3, "dsf", 24);
//		personDAOImpl.save(4, "dsfaf", 23);
//		personDAOImpl.save(5, "dsfsadfadf", 456);
//		personDAOImpl.save(6, "sadfwer", 56);
//		personDAOImpl.save(7, "vxzcvxzcv", 123);
//		personDAOImpl.save(8, "dasf3r", 324);
//		personDAOImpl.save(9, "xzcvrg", 23249);
//		personDAOImpl.save(10, "vxzcvewf", 234);
		
		//personDAOImpl.update(1, "Sagar", 30);
		
		//personDAOImpl.delete(10);
		
		List<Map<String, Object>> list1 = personDAOImpl.read(1);
		System.out.println(list1);
		
		List<Map<String, Object>> list2 = personDAOImpl.readAll();
		for (Map<String, Object> map : list2) {
			System.out.println(map);
		}
		
		
		System.out.println("Done");
	}
}
