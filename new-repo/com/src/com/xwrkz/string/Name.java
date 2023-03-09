package com.xwrkz.string;

public class Name {
	public static void main(String[] args) {
		String name = "bhairavi";
		System.out.println(name);

		int value = name.length();
		System.out.println(value);

		String uppercase = name.toUpperCase();
		System.out.println(uppercase);
		String lowercase = name.toLowerCase();
		System.out.println(lowercase);
		String nonTrimmedString = "    bhairavi";
		System.out.println(nonTrimmedString);
		String trimmedString = nonTrimmedString.trim();
		System.out.println(trimmedString);
		System.out.println(name.substring(0, 1).toUpperCase() + name.substring(2, 4) + "  "
				+ name.substring(3, 4).toUpperCase() + name.substring(6));
		System.out.println(name.replace('b', 'h'));
		System.out.println(name.replace("b", "ravi"));
		System.out.println(name.endsWith("ravi"));
		System.out.println(name.startsWith("bhai"));
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("i"));
		System.out.println(name.lastIndexOf(3));
		System.out.println(name.lastIndexOf("name"));
		System.out.println(name.lastIndexOf(4, 5));
		System.out.println(name.indexOf("name", 3));
		System.out.println(name.intern());
		System.out.println(name.matches(name));
		System.out.println(name.offsetByCodePoints(0, 5));
		System.out.println(name.regionMatches(4, "name", 5, 4));
		System.out.println(name.regionMatches(true, 0, name, 4, 5));
		String modifiedName = "bhaar";
		System.out.println(modifiedName.indexOf("bha"));
		System.out.println(modifiedName.lastIndexOf("ra", 6));
		System.out.println(name.equals("ravi"));
		System.out.println(name.equalsIgnoreCase("bhai"));
		System.out.println("I am sequence\t double code");
		System.out.println("please leave us\\single code");
		boolean result = name.isEmpty();
		System.out.println(result);
		System.out.println(name.concat("gowda"));
		System.out.println(name.contains("gow"));
		System.out.println(name.contentEquals("bhai"));
		System.out.println(name.hashCode());
		System.out.println(name.intern());
		System.out.println(name.codePointAt(0));
		System.out.println(name.codePointBefore(1));
		System.out.println(name.codePointCount(0, 5));
		System.out.println(name.compareTo(name));
		System.out.println(name.compareToIgnoreCase(name));
		System.out.println(name.contains(name));
		System.out.println(name);
		System.out.println(name.replace("b", "h"));
		System.out.println(name.replaceAll("bhairavi", "geetha"));
		System.out.println(name.replaceFirst("b", "m"));
		System.out.println(name.isBlank());
		char ch[] = name.toCharArray();
		for (char ref : ch) {
			System.out.println(ref);
		}
//to calculate the number of word in sentence
		String name2 = "dont go come go in";
		String[] count = name2.split(" ");
		int length = count.length;
		System.out.println(length);

//to find good in a sentence

		boolean occur = false;
		int wordCount = 0;
		for (String s : count) {
			occur = s.contains("go");
			if (occur == true) {
				wordCount++;
			}
		}
		System.out.println(wordCount);

//to reverse a word
		String sentence1 = "good good go good", nword = "";
		char ch1;
		for (int i = 0; i < sentence1.length(); i++) {
			ch1 = sentence1.charAt(i);
			nword = ch1 + nword;
		}
		System.out.println(nword);

	}

}
