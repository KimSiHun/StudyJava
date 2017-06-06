package org.shkim.study.java.date;

import java.text.ParseException;
import java.util.Date;

public class SimpleDateFormat {

	// 현재 시간 획득
	static long st_time = System.currentTimeMillis();

	static java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");

	public static void main(String[] args) {

		String date = sdf.format(st_time);

		// String
		System.out.println(date);
		System.out.println(sdf.format(new Date(st_time)));

		// long
		System.out.println(st_time);
		try {
			// Date
			System.out.println(sdf.parse(date));

			// long
			System.out.println(sdf.parse(date).getTime());
		} catch (ParseException e) {
			System.err.println(e);
		}
	}
}
