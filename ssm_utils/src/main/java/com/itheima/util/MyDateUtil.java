package com.itheima.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtil {
	public static String changeDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String format = dateFormat.format(date);
		return format;
	}
}
