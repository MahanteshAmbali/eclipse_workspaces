package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);					
		list.add(6768);
		list.add(787234);
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Enter which min req");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		System.out.println(index+" min in the list is: "+list.get(0+index-1));
	}
}
