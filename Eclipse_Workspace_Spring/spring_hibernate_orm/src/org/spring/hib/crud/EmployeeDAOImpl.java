package org.spring.hib.crud;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;


public class EmployeeDAOImpl implements EmployeeDAO{

	public HibernateTemplate hibernateTemplate;
	
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	static class MyHibernateCallbackCreate implements HibernateCallback{
		Object object;
		@Override
		public Object doInHibernate(Session arg0) throws HibernateException {
			// TODO Auto-generated method stub
			arg0.beginTransaction();
			arg0.save(object);
			arg0.getTransaction().commit();
			
			arg0.flush();
			return null;
		}
	}
	
	static class MyHibernateCallbackReadAll implements HibernateCallback{
		Object obj;
		@Override
		public Object doInHibernate(Session arg0) throws HibernateException {
			// TODO Auto-generated method stub

			Query query = arg0.createSQLQuery("select * from Employee_Hib_Crud");
			List<Object[]> list = query.list();
			for (Object[] objects : list) {
				System.out.println(Arrays.toString(objects));
			}
			return null;
		}
	}
	
	static class MyHibernateCallbackDelete implements HibernateCallback{
		Object obj;
		@Override
		public Object doInHibernate(Session arg0) throws HibernateException {
			// TODO Auto-generated method stub
			arg0.beginTransaction();
			arg0.delete(obj);
			
			arg0.flush();
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		MyHibernateCallbackCreate obj = new MyHibernateCallbackCreate();
		obj.object = employee;
		hibernateTemplate.execute(obj);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee readEmployee(int empId) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void readAllEmployees() {
		// TODO Auto-generated method stub
		
		MyHibernateCallbackReadAll obj = new MyHibernateCallbackReadAll();
		hibernateTemplate.execute(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		MyHibernateCallbackDelete obj = new MyHibernateCallbackDelete();
		obj.obj = employee;
		hibernateTemplate.execute(obj);
	}
	
	

}
