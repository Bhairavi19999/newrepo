package com.xworkz.army.util;

public class ArmyUtil {
	public ArmyUtil() {
		System.out.println("no areg cont of util");
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
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

	public static boolean validnumber(double number) {
		if (number > 0) {
			return true;

		}
		return false;
	}

	public static boolean valiFlag(boolean... flag) {
		for (int i = 0; i < flag.length; i++) {
			boolean temp = flag[i];
			if (!temp) {
				System.out.println("index invalid at :" + i);
				return false;
			}
		}
		return true;
	}

}
