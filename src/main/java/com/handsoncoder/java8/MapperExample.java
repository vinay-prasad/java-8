package com.handsoncoder.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapperExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mark", "Barry", "Marcos", "Gavin", "Mike", "Dan", "Peter", "Brian");

		// traditional way
		System.out.println("Traditional Way");
		for (String name : names) {
			if (name.equals("Dan")) {
				Employee emp = new Employee(name);
				System.out.println(emp);
			}
		}

		// java 8
		System.out.println("Java-8 Way");
		// names.stream().filter(name -> name.equals("Dan")).map(name -> {return new
		// Employee(name);}).forEach(System.out::println);
		// names.stream().filter(name -> name.equals("Dan")).map(name -> new
		// Employee(name)).forEach(System.out::println);
		names.stream().filter(name -> name.equals("Dan")).map(Employee::new).forEach(System.out::println);

		// List<Employee> employees = names.stream().filter(name ->
		// name.equals("Dan")).map(Employee::new).collect(Collectors.toList());
	}

	static class Employee {
		String name;
		double salary;

		public Employee(String name) {
			super();
			this.name = name;
			this.salary = Math.random() * 100000;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Emplpyee Name : " + name + " | salary : " + salary;
		}
	}
}
