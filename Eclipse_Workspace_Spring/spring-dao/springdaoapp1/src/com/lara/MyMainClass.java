package com.lara;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.Person;
import com.lara.PersonDAO;


public class MyMainClass {

	public static void main(String[] args)
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("personconfig.xml");
	PersonDAO personDAO=(PersonDAO)context.getBean("personDAO");
	
	/*Person person=new Person();

	person.setFirstName("jockyiiiiiiiii");
	person.setLastName("opps");
	personDAO.create(person);*/
	
	List<Person> ls=personDAO.getAllPerson();
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i).getId()+"==="+ls.get(i).getFirstName()+":"+ls.get(i).getLastName());
	}
	
	Person p2=personDAO.getPerson(2);
	System.out.println("selected person :"+p2.getId()+"="+p2.getFirstName()+":"+p2.getLastName());

	}

}
