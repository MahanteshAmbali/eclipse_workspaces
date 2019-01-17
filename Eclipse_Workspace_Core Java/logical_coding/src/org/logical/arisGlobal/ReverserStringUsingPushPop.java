package org.logical.arisGlobal;

import java.util.LinkedList;

public class ReverserStringUsingPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.push("g");
		linkedList.push("i");
		linkedList.push("r");
		linkedList.push("t");
		linkedList.push("S");
		
		System.out.println(linkedList);
		for (int i = 1; i < linkedList.size(); i--) {
			 sb.append(linkedList.pop());
		}
	}
}
