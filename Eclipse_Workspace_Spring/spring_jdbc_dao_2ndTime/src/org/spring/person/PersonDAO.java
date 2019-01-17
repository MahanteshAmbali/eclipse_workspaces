package org.spring.person;

import java.util.List;
import java.util.Map;

public interface PersonDAO {

	public void setup();
	
	public void save(int id, String name, int age);
	
	public void update(int id, String name, int age);
	
	public void delete(int id);
	
	public List<Map<String, Object>> read(int id);
	
	public List<Map<String,Object>> readAll();
}
