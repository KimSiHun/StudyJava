package org.shkim.study.java.string;

public class StartsWithEndsWith
{
	static String test = "ABCabc가나다123$#@";

	public static void main(String[] args)
	{
		boolean chk = test.startsWith("A");
		boolean chk2 = test.startsWith("AB");
		boolean chk3 = test.startsWith("a");

		boolean chk4 = test.endsWith("@");
		boolean chk5 = test.endsWith("#@");
		boolean chk6 = test.endsWith("#");

		System.out.println(chk + " " + chk2 + " " + chk3 + " " + chk4 + " " + chk5 + " " + chk6);
	}
}
