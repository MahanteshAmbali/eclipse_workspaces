package org.hashcode;

class F{
	
	int i;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash;
		String s1 = Integer.toString(i);
		
		return hash = s1.hashCode();
	}
}

class G{
	
	int k;
	String s1;
	boolean b1;
	F f1;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = 0;
		String str1 = Integer.toString(k);
		String str2 = Boolean.toString(b1);
		
		hash = str1.hashCode();
		hash = hash + str2.hashCode();
		
		if(s1 != null){
			hash = hash + s1.hashCode();
		}
		
		if(f1 != null){
			hash = hash + f1.hashCode();
		}
		
		return hash;
	}
}

public class Manager6 {

	public static void main(String[] args) {
		
		F f1 = new F();
		f1.i = 10;
		
		G g1 = new G();
		g1.k = 10;
		g1.s1 = "Mant";
		g1.f1 = f1;
		
		F f2 = new F();
		f2.i = 10;
		
		G g2 = new G();
		g2.k = 10;
		g2.s1 = "Mant";
		g2.f1 = f1;
		
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		
	}
}
