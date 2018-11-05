package com.handsoncoder.java8;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mark", "Barry", "Marcos", "Gavin", "Mike", "Dan", "Peter", "Brian");

		// traditional way
		System.out.println("Traditional Way");
		for (String name : names) {
			if (!name.equals("Dan")) {
				System.out.println(name);
			}
		}

		// java 8
		System.out.println("Java-8 Way");
		names.stream().filter(name -> !name.equals("Dan")).forEach(System.out::println);
	}
}
