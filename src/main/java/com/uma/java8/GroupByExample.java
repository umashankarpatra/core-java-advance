package com.uma.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

	private static List<Student> getStudeeList() {

		Student std0 = new Student(1, "umashankar", "Gurugaon");

		Student std2 = new Student(2, "gaurav", "Delhi");

		Student std3 = new Student(1, "amitr", "Delhi");

		List<Student> students = new ArrayList<Student>();

		students.add(std0);

		students.add(std2);

		students.add(std3);

		return students;

	}

	public static void main(String[] args) {

		List<Student> students = getStudeeList();

		Map<String, Long> mapObj = students.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));

		System.out.println(mapObj);

		// Java 7

		Map<String, List<String>> mapObj2 = new HashMap<String, List<String>>();

		for (Student std : students) {
			List<String> names = new ArrayList<String>();
			for (int i = 0; i < students.size(); i++) {
				if (std.getCity().equalsIgnoreCase(students.get(i).getCity())) {
					names.add(std.getName());
				}
			}
			mapObj2.put(std.getCity(), names);

		}

		// Java 8

		Map<String, List<String>> studGroupbyCity = students.stream().collect(
				Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList())));

		System.out.println("-->studGroupbyCity :" + studGroupbyCity);
	}

}
