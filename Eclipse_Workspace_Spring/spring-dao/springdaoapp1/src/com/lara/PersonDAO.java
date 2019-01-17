package com.lara;

import java.util.List;

public interface PersonDAO
{
	public void create(Person person);
	
	public List<Person> getAllPerson();
	
	public Person getPerson(int id);

}
