package com.lara;

import java.util.Arrays;

public class simpleFromNet {

	  public static void main(String[] argv) throws Exception {
	    int[] array = { 1, 2, 3 };
	    
	    System.arraycopy(array, 0, array, 1, array.length - 1);
	    System.out.println(Arrays.toString(array));
	    reverse(array);
	  }
	  
	  public static void reverse(int[] array) {
	    
		  if (array == null) {
	          return;
	      }
	      
		  int i = 0;
	      int j = array.length - 1;
	      int tmp;
	      while (j > i) {
	          tmp = array[j];
	          array[j] = array[i];
	          array[i] = tmp;
	          j--;
	          i++;
	      }
	      
	      System.out.println(Arrays.toString(array));
	  }
	
}