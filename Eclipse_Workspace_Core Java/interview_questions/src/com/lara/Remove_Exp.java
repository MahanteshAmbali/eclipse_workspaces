package com.lara;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_Exp {

	private int id;
	private String name;
	private double experience;
	
	public Remove_Exp() {
		// TODO Auto-generated constructor stub
	}
	
	public Remove_Exp(int id, String n, double exp){
		this.id = id;
		this.name = n;
		this.experience = exp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+id+", name: "+name+", experience: "+experience ;
	}
	
	public static void main(String[] args) {

		int id; 
		String name;
		double experience;
		
		System.out.println("Enter the number of employees to save");
		Scanner sc = new Scanner(System.in);
		int numberOfEmployees = sc.nextInt();
		
		Remove_Exp[] objs = new Remove_Exp[numberOfEmployees];
		
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < numberOfEmployees; i++) {
			
			System.out.println("Enter the details of "+(i+1)+" employee");
			System.out.println("Enter id: ");
			id = sc.nextInt();
			
			System.out.println("Enter name: ");
			name = sc.next();
			
			System.out.println("Enter experience: ");
			experience = sc.nextDouble();
			
			objs[i] = new Remove_Exp(id,name,experience);
			
			list.add(objs[i]);
		}
		
		System.out.println("Enter the experience to remove: ");
		double expRemove = sc.nextDouble();
		
		for (int i = 0; i < objs.length; i++) {
			if (objs[i].experience >= expRemove ) {
				list.remove(objs[i]);
			}
		}
		
		System.out.println(list);
		
	}
}
