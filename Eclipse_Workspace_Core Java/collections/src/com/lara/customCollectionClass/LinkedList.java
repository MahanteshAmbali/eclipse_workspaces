package com.lara.customCollectionClass;

public class LinkedList {

	private Element front, back;
	
	public void add(Object object){
		Element e = new Element();
		e.data = object;
		if(front == null){
			front = e;
		}else{
			back.next = e;
		}
		e.prev = back;
		back = e;
	}
	
	public void iterate(){
		Element e = front;
		while (e != null) {
			System.out.println(e.data);
			e = e.next;
		}
	}
	
	class Element{
		Element next;
		Element prev;
		Object data;
		@Override
		public String toString() {
			return "Element [next=" + next + ", prev=" + prev + ", data="
					+ data + "]";
		}
		
		
	}

	@Override
	public String toString() {
		return "LinkedList [front=" + front + ", back=" + back + "]";
	}
	
	
}
