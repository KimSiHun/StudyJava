package org.shkim.study.java.integer;

public class calc
{
	private static int sum(int a, int b)
	{
		return a + b;
	}

	private static int minus(int a, int b)
	{
		return a - b;
	}

	private static int multiply(int a, int b)
	{
		return a * b;
	}

	private static int divide(int a, int b)
	{
		if (b == 0)
		{
			return 0;
		}
		return a / b;
	}

	private static int pow(int a, int b)
	{
		int result = a;
		for (int i = 0; i < b - 1; i++)
		{
			result = result * a;
		}
		return result;
	}

	private static int mod(int a, int b)
	{
		if (b == 0)
		{
			return 0;
		}
		return a % b;
	}

	public static void main(String[] args)
	{
		System.out.println(sum(3, 4));
		System.out.println(minus(3, 4));
		System.out.println(multiply(3, 4));
		System.out.println(divide(3, 4));
		System.out.println(pow(3, 4));
		System.out.println(mod(3, 4));
	}
}
