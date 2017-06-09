package org.shkim.study.java.arr;

public class ArraySort
{
	public static void main(String[] args)
	{
		// 1. 하나씩 비교해서 정렬
		//    1 ~ 100 까지의 수 중 랜덤으로 삽입
		int arr[] = new int[100];

		int max = arr.length;
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * max)+1;
		}
		
		
		long s_time = System.currentTimeMillis();

		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		long e_time = System.currentTimeMillis();

		for (int i = 0; i < arr.length; i++)
		{
			if (i % 10 == 0)
			{
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\ntime diff - " + (e_time - s_time) / 1000.0 + "s");

	}

}
