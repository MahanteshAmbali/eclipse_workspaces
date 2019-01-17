package com.lara.hashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SkandaAssignment {

	private String custId;
	private String location;
	private String itemName;
	private int quantity;
	private static int j = 0;
	
	public SkandaAssignment() {
		// TODO Auto-generated constructor stub
	}
	
	public SkandaAssignment(String custId2, String location2, String itemName2,
			int quantity2) {
		// TODO Auto-generated constructor stub
		this.custId = custId2;
		this.location = location2;
		this.itemName = itemName2;
		this.quantity = quantity2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cust Id: "+custId+", Location: "+location+", Item Name: "+itemName+", Quantity: "+quantity;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custId == null) ? 0 : custId.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result
				+ ((quantity == 0) ? 0 : Integer.toString(quantity).hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkandaAssignment other = (SkandaAssignment) obj;
		if (custId == null) {
			if (other.custId != null)
				return false;
		} else if (!custId.equals(other.custId))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (quantity == 0) {
			if (other.quantity != 0)
				return false;
		} else if (!(quantity == other.quantity))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		String custId, location, itemName;
		int quantity;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of objects to store: ");
		int i = sc.nextInt();
		Object key, value;
		SkandaAssignment[] orderObjs = new SkandaAssignment[i];
		
		for (j = 0; j < orderObjs.length; j++) {
			System.out.println("Enter Customer Id for "+(j+1)+" : ");
			custId = sc.next();
			
			System.out.println("Enter Location for "+(j+1)+" : ");
			location = sc.next();
			
			System.out.println("Enter Item Name for "+(j+1)+" : ");
			itemName = sc.next();
			
			System.out.println("Enter Quantity for "+(j+1)+" : ");
			quantity = sc.nextInt();
			
			orderObjs[j] = new SkandaAssignment(custId, location, itemName, quantity);
			Integer s1 = hMap.put("CustId: "+custId+", CustLoc: "+location+", ProdName: "+itemName+", ProductQuan: ", quantity);
			if(s1 != null){
				hMap.put("CustId: "+custId+", CustLoc: "+location+", ProdName: "+itemName +", ProductQuan: ", ((orderObjs[j-1].quantity)+quantity));
			}
		}
		
		Set set = hMap.keySet();
		Iterator it= set.iterator();
		while (it.hasNext()) {
			key = it.next();
			value = hMap.get(key);
			System.out.println(key+""+value);
		}
	}

}
