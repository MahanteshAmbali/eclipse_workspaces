package org.logical.code;

class SingletonImp {
	
	private static SingletonImp singletonImp = null;
	
	static{
		singletonImp = new SingletonImp();
	}
	
	public SingletonImp() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constr");
	}
	
	public static SingletonImp returnSingleObj(){
		return singletonImp;
	}
}
public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		
		int i = Runtime.getRuntime().availableProcessors(); 
		SingletonImp obj1 = SingletonImp.returnSingleObj();
		SingletonImp obj2 = SingletonImp.returnSingleObj();
		SingletonImp obj3 = SingletonImp.returnSingleObj();
		SingletonImp obj4 = SingletonImp.returnSingleObj();
		SingletonImp obj5 = SingletonImp.returnSingleObj();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		
		System.out.println(i);
	}

}
