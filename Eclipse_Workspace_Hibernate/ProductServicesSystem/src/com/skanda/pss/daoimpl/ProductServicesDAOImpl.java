package com.skanda.pss.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.skanda.pss.dao.ProdcutServicesDAO;
import com.skanda.pss.dto.Product;
import com.skanda.pss.util.HibernateUtil;

public class ProductServicesDAOImpl implements ProdcutServicesDAO {
	
	/**
	 * This method fetches all products from DataStore.
	 */
	public List<Product> getProducts(){
		
		List<Product> productsList  = new ArrayList<Product>();
		Transaction transaction = null;
		Session session = null;
		try{
		session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		Query query  = session.createQuery("from product");
		productsList = query.list();
		transaction.commit();
		}
		catch(HibernateException ex){
			if(transaction != null){
				transaction.rollback();
			}
			
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return productsList;
	}

	@Override
	public Product getProductById(String productId) {
		Product product = null;
		Transaction transaction = null;
		Session session = null;
		try{
		session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		
		product = (Product)session.load(Product.class,productId);
		transaction.commit();
		}
		catch(HibernateException ex){
			if(transaction != null){
				transaction.rollback();
			}
			
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return product;
	}

}
