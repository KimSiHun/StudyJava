package org.shkim.study.java.arr;

public class ArraySum
{
	public static void main(String[] args)
	{
		long A[] = new long[1000000];

		for (int i = 0; i < A.length; i++)
		{
			A[i] = i + 1;
		}

		// 1~100 sum
		// use for
		long sum = 0;
		long a = System.currentTimeMillis();
		for (int i = 0; i < A.length; i++)
		{
			sum = sum + A[i];
		}
		long b = System.currentTimeMillis();
		System.out.println(sum + " " + (b - a) / 1000.0 + "s");

		// use max*(max+1)/2
		// int범위 초과하기 때문에 long으로 선언
		long c = System.currentTimeMillis();
		long max = A.length;
		long result = 0;
		result = (max * (max + 1)) / 2;
		long d = System.currentTimeMillis();
		System.out.println(result + " " + (d - c) / 1000.0 + "s");
	}
}
