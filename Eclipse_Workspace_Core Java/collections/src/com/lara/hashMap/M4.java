package com.lara.hashMap;

import java.util.HashMap;

public class M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hmap = new HashMap();

		hmap.put("abc", "element1");
		System.out.println(1+" : "+hmap);
		
		hmap.put("abc", 200);
		System.out.println(2+" : "+hmap);
		
		hmap.put("abc", true);
		System.out.println(3+" : "+hmap);
		
	}

}
