package com.lara.collectionInterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UserArrayList{

	private int i;
	
	public UserArrayList() {
		// TODO Auto-generated constructor stub
	}
	
	public UserArrayList(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
	
	@Override
	public String toString() {
		return "i= "+ i;
	}
	
	@Override
	public int hashCode() {
		
		return Integer.toString(i).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		UserArrayList userArrayList = (UserArrayList) obj;
		return (this.i == userArrayList.i);
	}

	public static void main(String[] args) {

		List<UserArrayList> list = new ArrayList<UserArrayList>(); 
		
		UserArrayList userArrayList1 = new UserArrayList(10);
		list.add(userArrayList1);
		
		UserArrayList userArrayList2 = new UserArrayList(20);
		list.add(userArrayList2);
		
		UserArrayList userArrayList3 = new UserArrayList(30);
		list.add(userArrayList3);
		
		UserArrayList userArrayList4 = new UserArrayList(10);
		list.add(userArrayList4);
		
		UserArrayList userArrayList5 = new UserArrayList(20);
		list.add(userArrayList5);
		
		Set<UserArrayList> hashSet = new HashSet<UserArrayList>();
		for (int i = 0; i < list.size(); i++) {
			hashSet.add(list.get(i));
		}
		
		System.out.println(hashSet);
	}
}
