package com.lara.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class M35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		HashMap hmap = new HashMap();
		hmap.put("abc", "element1");
		hmap.put("key", 200);
		hmap.put("sagar", true);
		
		hmap.put("element1", "abc");
		hmap.put(200, "key");
		hmap.put(true, "sagar");
		
		Set set = hmap.keySet();
		
		Iterator it = set.iterator();
		
		Object key = null, value;
		while (it.hasNext()) {
			key = it.next();
			value = hmap.get(key);
			System.out.println(key+" = "+value);
		}
		System.out.println("--------------------");
		
		
	}

}
