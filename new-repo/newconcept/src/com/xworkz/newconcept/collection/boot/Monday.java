package com.xworkz.newconcept.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Monday {
	public static void main(String[] args) {
		Collection<String> AttendenceSheet = new ArrayList<String>();
		AttendenceSheet.add("ramya");
		AttendenceSheet.add("kavya");
		AttendenceSheet.add("priya");
		AttendenceSheet.add("smitha");
		AttendenceSheet.add("sunitha");
		AttendenceSheet.add("kavitha");
		AttendenceSheet.add("tulasi");
		AttendenceSheet.add("suraksha");
		AttendenceSheet.add("samyuktha");
		AttendenceSheet.add("latha");
		System.out.println("total flowers are:" + AttendenceSheet.size());
		for (String coll : AttendenceSheet) {
			if (Objects.nonNull(AttendenceSheet)) {
				System.out.println(coll.toUpperCase());
			}
		}
		System.out.println("total flowers are:" + AttendenceSheet.size());
		Iterator<String> ite = AttendenceSheet.iterator();
		System.out.println("after using iterator   ......    .....  ");
		while (ite.hasNext()) {
			System.out.println("element exist......");
			String element = ite.next();
			System.out.println(element);
		}
		System.out.println("     ");

		Collection<String> Whiskey = new ArrayList<>();
		Whiskey.add("scotch");
		Whiskey.add("rye");
		Whiskey.add("canadian whiskey");
		Whiskey.add("johnnie walker");
		Whiskey.add("american whiskey");
		Whiskey.add("bulleit bourbon");
		Whiskey.add("evan williams");
		Whiskey.add("heaven hill");
		Whiskey.add("ballantine");
		Whiskey.add("buchanan");
		for (String coll : Whiskey) {
			if (Objects.nonNull(Whiskey)) {
				System.out.println(coll.toUpperCase());
			}
		}
		System.out.println("total whiskey are:" + Whiskey.size());
		Iterator<String> iter = Whiskey.iterator();
		System.out.println("after using iterator   ......    .....  ");
		while (iter.hasNext()) {
			System.out.println("element exist");
			String element = iter.next();
			System.out.println(element);
		}
		System.out.println("   ");
		Collection<Double> ExamSchedule = new ArrayList<Double>();
		ExamSchedule.add((double) 9);
		ExamSchedule.add(10.30);
		ExamSchedule.add((double) 11);
		ExamSchedule.add((double) 1);
		ExamSchedule.add(5.15);
		ExamSchedule.add(10.15);
		ExamSchedule.add((double) 10);
		ExamSchedule.add(10.40);
		ExamSchedule.add(10.55);
		ExamSchedule.add(10.35);

		System.out.println("total ExamSchedule:" + ExamSchedule.size());
		Iterator<Double> itera = ExamSchedule.iterator();
		System.out.println("after using iterator   ......    .....  ");
		while (itera.hasNext()) {
			System.out.println("element exist");
			Double element = itera.next();
			System.out.println(element);
		}
		System.out.println("   ");

		Collection<String> MovieCast = new ArrayList<>();
		MovieCast.add("hero:sudeep");
		MovieCast.add("heroin:bhavana");
		MovieCast.add("movie:vishnuvardhna");
		MovieCast.add("director:raj");
		MovieCast.add("producer:ram");
		MovieCast.add("music:vijay");
		MovieCast.add("cameraman:rahul");
		MovieCast.add("villan:sankar");
		for (String coll : MovieCast) {
			if (Objects.nonNull(MovieCast)) {
				System.out.println(coll.toUpperCase());
			}
		}
		System.out.println("total size is:" + MovieCast.size());
		Iterator<String> ref = MovieCast.iterator();
		System.out.println("after using iterator   ......    .....  ");
		while (ref.hasNext()) {
			System.out.println("elemnt exist");
			String element = ref.next();
			System.out.println(element);
		}
		System.out.println("     ");

		Collection<String> SamberPowder = new ArrayList<>();
		SamberPowder.add("MTR");
		SamberPowder.add("MDH");
		SamberPowder.add("24 MANTRA");
		SamberPowder.add("AASHIRVAAD");
		SamberPowder.add("PUSHP");
		SamberPowder.add("TATA");
		SamberPowder.add("EVEREST");
		SamberPowder.add("KEYA");
		SamberPowder.add("SAKTHI");
		SamberPowder.add("HOUSE OF KALIYAS");
		SamberPowder.add("HOUSE OF KALIYAS");
		SamberPowder.add("HOUSE OF KALIYAS");

		for (String coll : SamberPowder) {
			if (Objects.nonNull(SamberPowder)) {
				System.out.println(coll.toLowerCase());
			}
		}
		System.out.println("total size is:" + SamberPowder.size());
		Iterator<String> ref1 = SamberPowder.iterator();
		System.out.println("after using iterator   ......    .....  ");
		while (ref1.hasNext()) {
			System.out.println("element exist");
			String element = ref1.next();
			System.out.println(element);
		}
		System.out.println("                ");

		// remove
		String powder = "MTR";
		boolean remove = SamberPowder.remove(powder);
		System.out.println("remove:" + remove);
		System.out.println("                ");

//contains
		String another = "MDH";
		boolean ref3 = SamberPowder.contains(another);
		System.out.println("contains:" + ref3);
		System.out.println("total size is:" + SamberPowder.size());
		System.out.println("                ");

		// repeated
		Collection<String> powdersamber = new HashSet<String>(SamberPowder);
		for (String string : powdersamber) {

			int rep = Collections.frequency(SamberPowder, string);
			System.out.println("powder" + string + "repeat" + rep);
		}
		System.out.println("                ");

//addall
		Collection<String> all = new ArrayList<>();
		all.addAll(MovieCast);
		all.addAll(AttendenceSheet);
		all.addAll(SamberPowder);
		System.out.println("total(after adding all):" + all.size());
		System.out.println("                ");

		// removeall
		Collection<String> attend = new ArrayList<>();
		attend.add("bhairavi");
		attend.add("geetha");
		attend.addAll(AttendenceSheet);
		System.out.println("total attende:" + attend.size());
		attend.removeAll(AttendenceSheet);
		System.out.println("total attende(after remove all):" + AttendenceSheet.size());
		System.out.println("                ");

		// containall

		System.out.println("                ");

	}
}