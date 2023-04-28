package com.xworkz.newconcept.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Tuesday {
	public static void main(String[] args) {
		Collection<String> studentNames = new ArrayList<String>();
		studentNames.add("ramya");
		studentNames.add("kavya");
		studentNames.add("priya");
		studentNames.add("latha");
		studentNames.add("smitha");
		studentNames.add("sunitha");
		studentNames.add("kavitha");
		studentNames.add("tulasi");
		studentNames.add("latha");
		studentNames.add("suraksha");
		studentNames.add("samyuktha");
		studentNames.add("latha");
		System.out.println("total studentNames are:" + studentNames.size());
		for (String coll : studentNames) {
			if (Objects.nonNull(studentNames)) {
				System.out.println(coll.toUpperCase());
			}
		}
		System.out.println("total studentNames are:" + studentNames.size());
		// iterator
		Iterator<String> ite = studentNames.iterator();
		System.out.println("after using iterator   ......    .....  ");
		while (ite.hasNext()) {
			System.out.println("element exist......");
			String element = ite.next();
			System.out.println(element);
		}
		System.out.println("     ");
		

		// remove
		String name = "latha";
		boolean remove = studentNames.remove(name);
		System.out.println("remove:" + remove);
		System.out.println("                ");

		// contains
		String another = "samyuktha";
		boolean ref = studentNames.contains(another);
		System.out.println("contains:" + ref);
		System.out.println("total size is:" + studentNames.size());
		System.out.println("                ");

		// repeated
		Collection<String> ref1 = new HashSet<String>(studentNames);
		for (String string : ref1) {

			int rep = Collections.frequency(studentNames, string);
			System.out.println("names:" + string + "   repeat:" + rep);
		}
		System.out.println("                ");

		Collection<String> samberPowder = new ArrayList<>();
		samberPowder.add("MTR");
		samberPowder.add("MDH");
		samberPowder.add("24 MANTRA");
		samberPowder.add("AASHIRVAAD");
		samberPowder.add("PUSHP");
		samberPowder.add("TATA");
		System.out.println("powder are:" + samberPowder);
		// containsall
		Collection<String> powderlist = new ArrayList<>();
		powderlist.add("TATA");
		powderlist.add("MDH");
		// powderlist.add("bhairavi");
		System.out.println("contains all method:" + samberPowder.containsAll(powderlist));
		System.out.println("     ");

		// addall
		Collection<String> all = new ArrayList<>();
		all.addAll(studentNames);
		all.addAll(samberPowder);
		System.out.println("total(after adding all method):" + all.size());
		System.out.println("                ");

		// removeall
		Collection<String> stuname = new ArrayList<>();
		stuname.add("bhairavi");
		stuname.add("geetha");
		stuname.addAll(studentNames);
		System.out.println("total stuname:" + stuname.size());
		stuname.removeAll(studentNames);
		System.out.println("total stuname(after remove all method):" + studentNames.size());
		System.out.println("                ");

		// retainall

		Collection<String> colors = new ArrayList<>();
		colors.add("red");
		System.out.println(colors);
		ArrayList<String> colors1 = new ArrayList<>();
		colors1.add("blue");
		colors1.add("pink");
		colors1.add("yellow");
		System.out.println(colors1);
		System.out.println("retain:" + colors1.retainAll(colors));
		System.out.println(colors1);
		System.out.println("                ");
//toarray
		Collection<Integer> even = new LinkedHashSet<>();
		for (int i = 1; i <= 10; i++) {
			even.add(i);
		}
		Integer[] a = new Integer[0];
		Integer[] b = even.toArray(a);
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				System.out.println("even numbers are: " + b[i]);
			}
		}
		// clear
				studentNames.clear();
				System.out.println("after clear method:" + studentNames.size());
				System.out.println("     ");

	}

}
