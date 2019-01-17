package org.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put(new Integer(1) , 1);
		map.put(new Integer(1) , 1);
		map.put(2, 2);
		
		
		/*Set set = map.entrySet();
		Iterator it = set.iterator();
		Object key, value;
		while(it.hasNext()){
			key = it.next();
			value = map.get(key);
			System.out.println(key+", "+value);
		}*/
	}

}
