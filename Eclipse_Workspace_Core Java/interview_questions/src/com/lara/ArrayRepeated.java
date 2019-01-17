package com.lara;

public class ArrayRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,3,4,5,6,7,1,2,3,4,5,1};
		int[] y = null;
		
		int i1, j1, j2;
		int i,j, count = 1;
		
		for (i = 0; i < x.length; i++) {
			i1 = x[i];
			for (j = i+1; j < x.length; j++) {
				j1 = x[j];
				if((i1 == j1)){
					//count++;
					System.out.println(i1+ " occurs "+(++count)+" times");
				}
				count = 0;
			}
		}
		
		int sdaf= method();
		System.out.println(sdaf);
	}

	@SuppressWarnings("finally")
	private static int method() {
		// TODO Auto-generated method stub
		try {
			
			
		}catch(Exception e){
			
		}finally{
			return 10;
		}
		
	}

}
