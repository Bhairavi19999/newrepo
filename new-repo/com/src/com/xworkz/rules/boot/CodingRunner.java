package com.xworkz.rules.boot;

import com.xworkz.rules.Coding;
import com.xworkz.rules.CodingRules;

public class CodingRunner {

	public static void main(String[] args) {
		CodingRules code = new CodingRules();
		System.out.println(code.className());
		System.out.println(code.variableName());
		System.out.println(code.underscore());
		System.out.println(code.packages());
		System.out.println(code.linesOfCode());
		System.out.println(code.defaultPackage());
		System.out.println(code.publicClass());
		System.out.println(code.methodDescription());
		System.out.println(code.semicolon());
		System.out.println(code.SOP());
		System.out.println("   ");
		
		
		
		Coding code1 = new CodingRules();
		System.out.println(code1.className());
		System.out.println(code1.variableName());
		System.out.println(code1.underscore());
		System.out.println(code1.packages());
		System.out.println(code1.linesOfCode());
		System.out.println(code1.defaultPackage());
		System.out.println(code1.publicClass());
		System.out.println(code1.methodDescription());
		System.out.println(code1.semicolon());
		System.out.println(code1.SOP());

	}

}
