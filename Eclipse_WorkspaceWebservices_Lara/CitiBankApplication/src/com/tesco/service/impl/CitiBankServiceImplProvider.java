package com.tesco.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.tesco.dao.CitiBankDAO;
import com.tesco.dao.impl.CitiBankDAOImpl;
import com.tesco.service.CitiBankService;

@WebService(targetNamespace = "http://impl.service.tesco.com/", portName = "CitiBankServiceImplProviderPort", serviceName = "CitiBankServiceImplProviderService")
public class CitiBankServiceImplProvider implements CitiBankService {

	CitiBankDAO citiBankDAO = new CitiBankDAOImpl();
	@WebMethod(operationName = "validateCriditCard", action = "urn:ValidateCriditCard")
	@RequestWrapper(className = "com.tesco.service.impl.jaxws.ValidateCriditCard", localName = "validateCriditCard", targetNamespace = "http://impl.service.tesco.com/")
	@ResponseWrapper(className = "com.tesco.service.impl.jaxws.ValidateCriditCardResponse", localName = "validateCriditCardResponse", targetNamespace = "http://impl.service.tesco.com/")
	@WebResult(name = "return")
	public Boolean validateCriditCard(@WebParam(name = "arg0") Integer creditCardNumber) {
		
		System.setProperty("java.net.preferIPv4Stack", "true");

		Boolean isValidCreditCard = Boolean.FALSE;
		
		isValidCreditCard = citiBankDAO.validateCreditCard(creditCardNumber);
		
		return isValidCreditCard;
	}
	
}
