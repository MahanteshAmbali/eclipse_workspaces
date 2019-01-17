package org.java;

public abstract class AbstractReseDev {

	private static int i ;
	static int j;
	protected static int k;
	public static int l;
	
	public AbstractReseDev() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractReseDev(int i){
		this.i = i;		
	}
	
	public abstract void abstractMethod();
	
	void nonAbstractMethod(){
		
	}
	
	public static void main(String[] args) {

		
	}

}

class MyClass extends AbstractReseDev{
	
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	public MyClass(int i){
		
	}
	
	void someMethod(){
		
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void nonAbstractMethod() {
		// TODO Auto-generated method stub
		super.nonAbstractMethod();
	}
}

class AnotherClass extends MyClass{

	public AnotherClass() {
		// TODO Auto-generated constructor stub
	}
}