package org.shkim.study.java.date;

import java.text.SimpleDateFormat;

public class DateFunction
{
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
	
	public static long pr_st_time = System.currentTimeMillis();
	
	private static long diff(long e_time, long s_time)
	{
		return (e_time-s_time);
	}
	
	public static void main(String[] args)
	{
		System.out.println("pr start at - "+sdf.format(pr_st_time));
		int i =0;
		while (true)
		{
			if (i == 100)
			{
				break;
			}
			
			i++;
			try
			{
				Thread.sleep(100l);
			} catch (InterruptedException e)
			{
				System.err.println(e);
			}
			System.out.println(i);
		}
		
		long pr_e_time = System.currentTimeMillis();
		System.out.println("pr end at - "+ sdf.format(pr_e_time));
		System.out.println(diff(pr_e_time, pr_st_time)/1000.0+"s");
	}
}
