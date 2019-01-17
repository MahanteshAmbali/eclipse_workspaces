package com.lara.customCollectionClass;

import java.util.Arrays;

public class ArrayList {

	private Object[] elements;
	private int size = 0, capacity = 0;
	
	public ArrayList() {
		capacity = 10;
		elements = new Object[capacity];
	}

	public void add(Object object) {
		if(elements.length == capacity){
			alterCapacity();
		}
		elements[size++] = object;
	}

	private void alterCapacity() {
		Object[] temp = elements;
		capacity = capacity * 2;
		elements = new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
		
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ ");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i]+", ");
		}
		
		return sb.substring(0, sb.length()-1)+" ]";
	}

	public Object get(int i) {
		if(i < 0 || i >= size){
			return new ArrayIndexOutOfBoundsException("Index exceeds size");
		}
		return elements[i];
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	
}
