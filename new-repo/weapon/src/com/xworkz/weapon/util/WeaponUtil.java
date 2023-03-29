package com.xworkz.weapon.util;

import java.time.LocalDate;

public class WeaponUtil {

	private WeaponUtil() {

	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int num) {
		if (num > 0 && num < 100000) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double number) {
		if (number > 0 && number < 10000) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate day = LocalDate.now().plusDays(1);
		LocalDate after = LocalDate.of(2020, 1, 1);
		if (date != null && date.isBefore(day) && date.isAfter(after)) {
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
