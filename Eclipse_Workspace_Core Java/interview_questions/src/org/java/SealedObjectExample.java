package org.java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;

class A implements Serializable{
	
	int i;
	double j;
	
}


public class SealedObjectExample {

	public static FileOutputStream fOut;
	public static ObjectOutputStream oOut;

	private static KeyGenerator keygenerator = null;
	private static SecretKey secretkey = null;
	private static Cipher cipher = null;
	private static SealedObject sealedObject = null;
	
	public static void main(String[] args) throws Exception {
		
		keygenerator = KeyGenerator.getInstance("Blowfish");

	    secretkey = keygenerator.generateKey();

	    cipher = Cipher.getInstance("Blowfish");
	    
	    cipher.init(Cipher.ENCRYPT_MODE, secretkey);
	    doSerialisation();
	    
	    doDeSerialisation();
	}

	private static void doSerialisation() throws Exception {

		A a1 = new A();
		a1.i = 10;
		a1.j = 20.0;
		
		SealedObject sealedObject = new SealedObject(a1, cipher);
	}
	
	private static void doDeSerialisation() throws Exception {
		
		cipher.init(Cipher.DECRYPT_MODE, secretkey);
		A a2 = (A)sealedObject.getObject(secretkey);
		System.out.println(a2.i);
		System.out.println(a2.j);
	}

}
