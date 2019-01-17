package inter.questions;

class A implements Cloneable {
	int i;
	
	@Override
	public int hashCode() {

		String s = Integer.toString(i);
		 
		return s.hashCode();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Equals_Hashcode {

	public static void main(String[] args) {

		A a1 = new A();
		a1.i = 10;
		
		A a2 = new A();
		a2.i = 11;
		
		A a3 = null;
		
		try {
			  a3 = (A)a2.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println(a3);
	}

}
