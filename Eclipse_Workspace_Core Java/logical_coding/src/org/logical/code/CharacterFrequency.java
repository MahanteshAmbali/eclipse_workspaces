package org.logical.code;

public class CharacterFrequency 
{
	public static void main(String[] args) 
	{
		int letterCount = 0;
		String check_word="Debugging";
		String single_letter = "";
		int i;
		for(i =0;i<check_word.length();i++)
		{
			
			single_letter = check_word.substring(1,1);
			if(single_letter.equals("g"));
			{
				letterCount++;
			}
			
		}
		System.out.println("G was found"+letterCount+"times");
		
	}

}
