package sportsspots.dto;

public class Util {
	private Util() {
		System.out.println("no arg const of desert");
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
				return false;
			} else {
				// System.out.println("data is invalid at index:" + i);

				return true;
			}
		}
		return false;
	}

}
