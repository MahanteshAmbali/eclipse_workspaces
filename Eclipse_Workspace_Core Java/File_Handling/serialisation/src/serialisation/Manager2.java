package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable{
	int i;
	String s1;
	Boolean b1;
	
	B(int i, String s1, Boolean b1){
		this.i = i;
		this.s1 = s1;
		this.b1 = b1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", s1: "+s1+", b1: "+b1;
	}
}

public class Manager2 {
	
	public static void main(String[] args) {
		
		doSerilizationDemo();
		System.out.println("Seriliazation Done");
		doDeSerilizationDemo();
		System.out.println("Deserilisation Done");
	}

	private static void doSerilizationDemo() {
		FileOutputStream fOut = null;
		ObjectOutputStream oOut= null;
		
		B b1 = new B(10, "Mahantesh", true);
		try {
			fOut = new FileOutputStream("test2.txt");
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(b1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (oOut != null) {
					oOut.flush();
					oOut.close();
					oOut = null;
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}

			try {
				if (fOut != null) {
					fOut.close();
					fOut = null;
				}
			} catch (Exception e3) {
				e3.printStackTrace();
				// TODO: handle exception
			}
		}
		
	}

	private static void doDeSerilizationDemo() {
		
		FileInputStream fIn= null;
		ObjectInputStream oIn = null;
		
		try {
			fIn = new FileInputStream("test2.txt");
			oIn = new ObjectInputStream(fIn);
			B b1 = (B) oIn.readObject();
			System.out.println(b1.i);
			System.out.println(b1.s1);
			System.out.println(b1.b1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (oIn != null) {
					oIn.close();
					oIn = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}

			try {
				if (fIn != null) {
					fIn.close();
					fIn = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
}
