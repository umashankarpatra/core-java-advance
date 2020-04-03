
package com.uma.java8;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapMethodExample {

	public static void main(String[] args) {

		Employee employee1 = new Employee(Date.valueOf(LocalDate.now()), 12.000);
		Employee employee2 = new Employee(Date.valueOf(LocalDate.of(2012, 3, 12)), 30.000);
		List<Employee> employies = Arrays.asList(employee1, employee2);
		List<java.util.Date> dateOfBirth = employies.stream().map(Employee::getDateOfBirth)
				.collect(Collectors.toList());
		System.out.println(dateOfBirth);

	}

}
