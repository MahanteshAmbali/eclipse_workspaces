package org.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Remove_5_Yr_Exp 
{
	private  int id;
	private  String Name;
	private  double experience;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+id + ", Name: "+Name + ", Experience: "+experience;
	}
	
	public Remove_5_Yr_Exp(int id, String fName, double exp) {
		this.id= id;
		this.Name = fName;
		this.experience = exp;
	}
	
	public void printData(){
		
		System.out.println(this.id);
		System.out.println(this.Name);
		System.out.println(this.experience);
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of list: ");
		int listSize = sc.nextInt();
		
		Remove_5_Yr_Exp[] objs = new Remove_5_Yr_Exp[listSize];
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < listSize; i++) {
			System.out.println("Enter id of " +i + " employee");
			objs[i].id = sc.nextInt();

			System.out.println("Enter name of " +i + " employee");
			objs[i].Name = sc.nextLine();
			
			System.out.println("Enter experience of " +i + " employee");
			objs[i].experience = sc.nextDouble();
			
			list.add(objs[i]);
		}
		
		for (int i = 0; i < listSize; i++) {
			objs[i].printData();
		}
		*/
		/*Remove_5_Yr_Exp r1 = new Remove_5_Yr_Exp(1, "Dell", 6);
		Remove_5_Yr_Exp r2 = new Remove_5_Yr_Exp(2, "Sony", 7);
		Remove_5_Yr_Exp r3 = new Remove_5_Yr_Exp(3, "Lenovo", 2);
		
		ArrayList list= new ArrayList();
		
		list.add(r1);
		list.add(r2);
		list.add(r3);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
			
		if (r1.experience >= 5) {

			list.remove(r1);
		}else{
			
			System.out.println(list);
		}

		if (r2.experience >= 5) {
			
			list.remove(r2);
		}else{
			System.out.println(list);
		}
		
		if (r3.experience >= 5) {
			
			list.remove(r3);
		}else{
			System.out.println(list);
		}
			
*/
		
		
	}
}