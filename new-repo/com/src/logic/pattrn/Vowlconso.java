package logic.pattrn;

public class Vowlconso {
	public static void main(String str) {
		int vow = 0, con = 0;
		String ref = "aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				if (ref.indexOf(str.charAt(i)) != -1)
					vow++;
				else
					con++;
			}
		}
		System.out.println("number of vowel is:" + vow + "\nnumber of consonents is:" + con);

	}

}
