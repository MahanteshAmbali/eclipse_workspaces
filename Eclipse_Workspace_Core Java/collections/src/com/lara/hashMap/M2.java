package com.lara.hashMap;

import java.util.HashMap;

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hmap = new HashMap();
		hmap.put("abc", "element1");
		hmap.put("key", 200);
		hmap.put("sagar", true);
		
		hmap.put("1", null);
		hmap.put(null, "1");		
		hmap.put(null, null);
		
		//System.out.println(hmap);
		
		System.out.println(hmap.get("key"));
		System.out.println(hmap.get("null"));
	}

}
