package com.uma.java8;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private String lname;
	private Float salary;

	public Employee() {

	}

	public Employee(Integer id, String name, String lname, Float salary) {
		this.id = id;
		this.lname = name;
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

	public Float getSalary() {
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
}
