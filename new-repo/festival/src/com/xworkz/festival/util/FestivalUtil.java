package com.xworkz.festival.util;

import java.time.LocalDate;

public class FestivalUtil {
	private FestivalUtil() {
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int num) {
		if (num > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate day = LocalDate.now();
		if (date != null && date.isAfter(day)) {
			return true;
		}
		return false;
	}

	public static boolean valiFlag(boolean... flag) {
		for (int i = 0; i < flag.length; i++) {
			boolean temp = flag[i];
			if (!temp) {
				return false;
			} else {
				//System.out.println("data is invalid at index:" + i);

				return true;
			}
		}
		return false;
	}

}
