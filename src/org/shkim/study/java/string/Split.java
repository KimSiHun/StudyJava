package org.shkim.study.java.string;

public class Split
{
	static String test="ABCabc가나다123$#@";
	
	public static void main(String[] args)
	{
		String testArray[] = test.split("가");
		for (String s : testArray)
		{
			System.out.println(s);
		}
		
	}
}
