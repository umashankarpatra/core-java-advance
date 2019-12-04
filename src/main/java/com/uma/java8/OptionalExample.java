
package com.uma.java8;

import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		// using ifPresent
		List<Employee> employies = Employee.getEmployeeData();
		Optional<Employee> employee = Optional.of(employies.get(0));

		employee.ifPresent(emp -> System.out.println(emp.getName()));

	}

}
