package org.shkim.study.java.date;

import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.time.FastDateFormat;

public class FastDateForm {
	// date format
	static FastDateFormat df = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.KOREA);

	// current time
	static long st_Time = System.currentTimeMillis();

	public static void main(String[] args) {

		// long to String formatting
		String date = df.format(st_Time);
		System.out.println(date);

		// Date to String formatting
		String date2 = df.format(new Date(st_Time));
		System.out.println(date2);

		// get pattern
		System.out.println(df.getPattern());
	}
}
