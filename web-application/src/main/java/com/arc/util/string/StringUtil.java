package com.arc.util.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalDate;

public class StringUtil {
	public static LocalDate getLocalDateFromString(String date, String format) {
		DateFormat formatter = new SimpleDateFormat(format);
		Date dt = null;
		try {
			dt = formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new LocalDate(dt);
	}
}
