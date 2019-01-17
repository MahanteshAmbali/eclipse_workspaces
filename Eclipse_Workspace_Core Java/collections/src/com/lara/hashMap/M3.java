package com.lara.hashMap;

import java.util.HashMap;

public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hmap = new HashMap();

		hmap.put("1", null);
		hmap.put(null, "1");		
		hmap.put(null, null);
		System.out.println(hmap);
	}

}
