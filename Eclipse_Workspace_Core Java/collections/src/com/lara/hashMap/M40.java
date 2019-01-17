package com.lara.hashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class M40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put("key", 2000);
		map.put("abc", 374);
		map.put("hello", 2745);
		map.put("done", 9374);
		map.put("check", 1243);
		map.put("test", 7492);
		map.put("java", 729);
		
		System.out.println(map);
		
		TreeMap trMap = new TreeMap(map);
		System.out.println(trMap);
		
	}

}
