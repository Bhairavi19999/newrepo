package com.xwrkz.string;

public class Task {

	public static void main(String[] args) {
		// reverse
		String word = "bhairavi", nword = "";
		char ch1;
		for (int i = 0; i < word.length(); i++) {
			ch1 = word.charAt(i);
			nword = ch1 + nword;
		}
		System.out.println("given word is:" + word);
		System.out.println("reverse word is:" + nword);
		System.out.println("    ");

		// count the number of words in sentence
		String sentence = "be good do good";
		String[] count = sentence.split(" ");
		int length = count.length;
		System.out.println("number of words in given sentence is:" + length);
		System.out.println("     ");

		// duplicate
		int[] n = new int[] { 22, 23, 24, 26, 23, 22, 1, 2, 1 };
		System.out.println("duplicate elements are");
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j])
					System.out.println(n[j]);
			}
		}
		System.out.println("     ");

		// compare strings
		String style = "flower";
		String style1 = "flower";
		if (style == style1)
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		System.out.println("   ");
            
		
		//
	}
}