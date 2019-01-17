package com.lara.customCollectionClass;

public class Manager1 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(89);
		list.add(329);
		list.add(19);
		list.add(459);
		list.add(413);

		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i)+", ");
		}
	}

}
