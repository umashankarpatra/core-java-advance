package com.uma.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private String lname;
	private double salary;

	public Employee() {

	}

	public Employee(Integer id, String name, String lname, double salary) {
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.salary = salary;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {

		return o.getId().compareTo(this.getId());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lname=" + lname + ", salary=" + salary + "]";
	}

	static List<Employee> getEmployeeData() {

		Employee emp1 = new Employee(2, "uma", "patra", 10.0f);
		Employee emp2 = new Employee(3, "uma", "patra", 15.0f);
		Employee emp3 = new Employee(3, "uma", "patra", 16.0f);
		Employee emp4 = new Employee(3, "uma", "patra", 17.0f);

		ArrayList<Employee> empObj = new ArrayList<Employee>();
		empObj.add(emp1);
		empObj.add(emp2);
		empObj.add(emp3);
		empObj.add(emp4);

		return empObj;
	}
	
	
}
