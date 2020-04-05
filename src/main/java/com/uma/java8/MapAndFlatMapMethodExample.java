
package com.uma.java8;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapMethodExample {

	public static void main(String[] args) {

		// map() example
		Employee employee1 = new Employee(Date.valueOf(LocalDate.now()), 12.000);
		Employee employee2 = new Employee(Date.valueOf(LocalDate.of(2012, 3, 12)), 30.000);
		List<Employee> employies = Arrays.asList(employee1, employee2);
		List<java.util.Date> dateOfBirth = employies.stream().map(Employee::getDateOfBirth)
				.collect(Collectors.toList());
		System.out.println(dateOfBirth);

		// flatMap() example

		List<Integer> employeeAge = Arrays.asList(23, 34, 90, 34);
		List<Integer> hrAge = Arrays.asList(12, 32, 45, 56);

		List<List<Integer>> ageOfAll = Arrays.asList(employeeAge, hrAge);
		List<Integer> age = ageOfAll.stream().flatMap(a -> a.stream()).filter(a->a>20).collect(Collectors.toList());
		age.forEach(a -> System.out.println(a));

	}

}
