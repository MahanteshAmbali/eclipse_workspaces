package com.first;

import java.lang.Thread.State;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.State states[] = Thread.State.values();
		for (State state : states) {
			System.out.println(state);
		}
	}

}
