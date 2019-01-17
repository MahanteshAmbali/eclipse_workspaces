package com.lara.collectionInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArrayList {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(10);
		arrayList.add(10);

		Set<Integer> hashSet = new HashSet<Integer>() ;
		for (int i = 0; i < arrayList.size(); i++) {
			hashSet.add(arrayList.get(i));
		}
		
		System.out.println(hashSet);
	}

}
