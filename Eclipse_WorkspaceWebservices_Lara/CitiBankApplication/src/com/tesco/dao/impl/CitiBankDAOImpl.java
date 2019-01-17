package com.tesco.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.tesco.dao.CitiBankDAO;

public class CitiBankDAOImpl implements CitiBankDAO {

	public Boolean validateCreditCard(Integer creditCardNumber) {
		
		Boolean isValidCreditCardFromDB = Boolean.FALSE;
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(123456);
		list.add(456636);
		list.add(245674);
		list.add(789567);
		list.add(789454);
		list.add(385869);
		
		if(list.contains(creditCardNumber)){
			isValidCreditCardFromDB = Boolean.TRUE;
		}
		
		return isValidCreditCardFromDB;
	}
}
