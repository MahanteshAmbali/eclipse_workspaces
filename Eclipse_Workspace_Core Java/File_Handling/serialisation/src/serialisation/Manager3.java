package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
	transient double j;

	public C(int i, double j) {
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", j: "+j;
	}
}

public class Manager3 
{
	public static void main(String[] args) 
	{
		C c1 = new C(10,20.0);
		doSeriliase(c1);
		
		C c2 = doDeSeriliase();
		System.out.println(c2);
	}
	
	private static void doSeriliase(C c1) 
	{
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null;
		try 
		{
			fOut = new FileOutputStream("test3.txt");
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(c1);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(oOut != null)
				{
					oOut.flush();
					oOut.close();
					oOut = null;
				}
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
					try 
			{
				if(fOut != null)
				{
					fOut.close();
					fOut = null;
				}
			}
			catch (Exception e3) 
			{
				e3.printStackTrace();
			}
		}
			
	}
	
	private static C doDeSeriliase() 
	{
		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		C c1 = null;
		try 
		{			
			fIn = new FileInputStream("test3.txt");
			oIn = new ObjectInputStream(fIn);
			c1 = (C)oIn.readObject();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return c1;
	}
}