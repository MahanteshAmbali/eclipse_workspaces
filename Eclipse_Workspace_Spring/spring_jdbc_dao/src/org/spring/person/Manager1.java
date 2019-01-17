package org.spring.person;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class Manager1 {

	public static void main(String[] args) {

		PersonImpl personImpl = new PersonImpl();
		
		JdbcTemplate jdbcTemplate = Util.getTemplate("sampleJDBCTemplate");
		
		personImpl.jdbcTemplate(jdbcTemplate);
		
//		personImpl.setup();							//one-time run
		
//		personImpl.save(0, "Mahantesh", 28);
//		personImpl.save(1, "Shipu", 28);
//		personImpl.save(2, "Rajeev", 28);
//		personImpl.save(3, "Anudeep", 28);
//		personImpl.save(4, "Suresh", 28);
		personImpl.save(5, "Hareesh", 28);
		
		System.out.println("Before Deleting");
		List<Map<String, Object>> list = personImpl.read(0);
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
		
		personImpl.delete(5);
		System.out.println("After Deleting");
		List<Map<String, Object>> list1 = personImpl.readAll();
		for (Map<String, Object> map : list1) {
			System.out.println(map);
		}
		
		System.out.println("Done");
	}

}
