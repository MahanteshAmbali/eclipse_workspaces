package com.ampliosys;

import java.util.Arrays;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,3,4,5}, result;
		
		result = multiplyData(a);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] multiplyData(int[] data) {
		int[] newArray=new int[data.length];
		for(int i=0;i<newArray.length;i++)
		{
			int temp=1;
			for(int j=0;j<newArray.length;j++)
			{
				if(i!=j)
				{
					temp*=data[j];
				}
			}
			newArray[i]=temp;	
		}
		return newArray;
	}
}


//PMD for Eclipse - http://sourceforge.net/projects/pmd/files/pmd-eclipse/update-site/