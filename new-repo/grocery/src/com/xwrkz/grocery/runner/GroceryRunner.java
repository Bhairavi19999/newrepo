package com.xwrkz.grocery.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.xwrkz.grocery.dto.GroceryDTO;

public class GroceryRunner {

	public static void main(String[] args) {
		Set<GroceryDTO> gro = new HashSet<>();
		gro.add(new GroceryDTO(1, "sugar", 40, 5));
		gro.add(new GroceryDTO(2, "rice", 60, 3));
		gro.add(new GroceryDTO(3, "ragi", 30, 6));
		gro.add(new GroceryDTO(4, "wheat", 50, 7));
		gro.add(new GroceryDTO(5, "jaggery", 80, 8));
		gro.add(new GroceryDTO(2, "rice", 60, 3));
		gro.add(new GroceryDTO(3, "ragi", 30, 6));
		gro.forEach(s -> System.out.println(s));
		System.out.println("    list            ");
		List<GroceryDTO> list = gro.stream().collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));

		System.out.println("         at index 2         ");
		System.out.println("index:" + list.get(2));

		System.out.println("         remove  at index 3      ");
		list.remove(3);
		list.forEach(s -> System.out.println(s));

		System.out.println("    addall with index        ");
		List<GroceryDTO> list1 = new ArrayList<>();

		list1.add(new GroceryDTO(7, "tea podwe", 400, 1));
		list.addAll(2, list1);
		list.forEach(s -> System.out.println(s));

		System.out.println(" iterator from reverse direction   ");
		ListIterator<GroceryDTO> listit = list.listIterator(list.size());
		while (listit.hasPrevious()) {
			GroceryDTO ref = listit.previous();
			System.out.println(ref);

		}
		System.out.println("     adding element over iteration   ");
		ListIterator<GroceryDTO> listit1 = list.listIterator();
		listit1.add(new GroceryDTO(9, "snack", 900, 12));
		list.forEach(s -> System.out.println(s));

	}

}
