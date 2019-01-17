package com.lara;

public class StringReverseFastest {

	public static void main(String[] args) {

		String srcString = "HelloWorldHowareyou";
		String tempString = "";
		double myRevLogicBeginTime = System.nanoTime();
		for (int i = srcString.length()-1; i >= 0; i--) {
			tempString = tempString + srcString.charAt(i);
		}
		double myRevLogicEndTime = System.nanoTime();
		System.out.println(tempString);
		System.out.println("Time req for my reverse logic: " +((myRevLogicEndTime - myRevLogicBeginTime) / 1000 )+ " micro sec");
		
		StringBuilder stringBuilder = new StringBuilder(srcString);
		double stringBuilderRevLogicBeginTime = System.nanoTime();
		System.out.println(stringBuilder.reverse());
		double stringBuilderRevLogicEndTime = System.nanoTime();
		
		System.out.println("Time req for stringbuilder's reverse logic: " +((stringBuilderRevLogicEndTime - stringBuilderRevLogicBeginTime) / 1000 )+ " micro sec");
		
		StringBuffer stringBuffer = new StringBuffer(srcString);
		double stringBufferRevLogicBeginTime = System.nanoTime();
		System.out.println(stringBuffer.reverse());
		double stringBufferRevLogicEndTime = System.nanoTime();
		
		System.out.println("Time req for stringbuffer's reverse logic: " +((stringBufferRevLogicEndTime - stringBufferRevLogicBeginTime) / 1000 )+ " micro sec");
		
	}

}
