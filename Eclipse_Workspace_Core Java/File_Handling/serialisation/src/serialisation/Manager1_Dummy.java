package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B1 implements Serializable{
	int i;
	double j;
}

public class Manager1_Dummy {

		public static FileOutputStream fOut;
		public static ObjectOutputStream oOut;
		public static FileInputStream fIn ;
		public static ObjectInputStream oIn;
		
		public static void main(String[] args){
			
			doSerialisation();
			doDeSerialisation();
		}

		private static void doSerialisation() {

			A a1 = new A();
			a1.i = 10;
			a1.j = 20.0;
			
			FileOutputStream fOut;
			try {
				fOut = new FileOutputStream("simple.txt");
				oOut = new ObjectOutputStream(fOut);
				oOut.writeObject(a1);
				oOut.flush();
				oOut.close();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Written to file");
		}
	
		
		private static void doDeSerialisation() {
			
			try{
				fIn = new FileInputStream("simple.txt");
				oIn = new ObjectInputStream(fIn);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			B1 b1= null;
			try {
				b1 = (B1) oIn.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(b1.i);
			System.out.println(b1.j);
		}

}
