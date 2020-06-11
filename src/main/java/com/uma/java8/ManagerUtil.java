package com.uma.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManagerUtil {

	public static List<Manager> getManagerDetails() {

		List<Manager> managerList = new ArrayList<Manager>();

		managerList.add(new Manager(111, "Jiya Brein", 32, "Delhi", "HR", 2011, 25000.0));
		managerList.add(new Manager(122, "Paul Niksui", 25, "Gurugaon", "Sales And Marketing", 2015, 13500.0));
		managerList.add(new Manager(133, "Martin Theron", 29, "Gurugaon", "Infrastructure", 2012, 18000.0));
		managerList.add(new Manager(144, "Murali Gowda", 28, "Gurugaon", "Product Development", 2014, 32500.0));
		managerList.add(new Manager(155, "Nima Roy", 27, "Delhi", "HR", 2013, 22700.0));
		managerList.add(new Manager(166, "Iqbal Hussain", 43, "Gurugaon", "Security And Transport", 2016, 10500.0));
		managerList.add(new Manager(177, "Manu Sharma", 35, "Gurugaon", "Account And Finance", 2010, 27000.0));
		managerList.add(new Manager(188, "Wang Liu", 31, "Gurugaon", "Product Development", 2015, 34500.0));
		managerList.add(new Manager(199, "Amelia Zoe", 24, "Delhi", "Sales And Marketing", 2016, 11500.0));
		managerList.add(new Manager(200, "Jaden Dough", 38, "Gurugaon", "Security And Transport", 2015, 11000.5));
		managerList.add(new Manager(211, "Jasna Kaur", 27, "Delhi", "Infrastructure", 2014, 15700.0));
		managerList.add(new Manager(222, "Nitin Joshi", 25, "Gurugaon", "Product Development", 2016, 28200.0));
		managerList.add(new Manager(233, "Jyothi Reddy", 27, "Delhi", "Account And Finance", 2013, 21300.0));
		managerList.add(new Manager(244, "Nicolus Den", 24, "Gurugaon", "Sales And Marketing", 2017, 10700.5));
		managerList.add(new Manager(255, "Ali Baig", 23, "Gurugaon", "Infrastructure", 2018, 12700.0));
		managerList.add(new Manager(266, "Sanvi Pandey", 26, "Delhi", "Product Development", 2015, 28900.0));
		managerList.add(new Manager(277, "Anuj Chettiar", 31, "Gurugaon", "Product Development", 2012, 35700.0));

		return managerList;

	}

	public static void main(String[] args) {

		List<Manager> managerList = getManagerDetails();

		// getNameOfAllDepartment(managerList);
		// getEmpName(managerList);
		getAvgSalEachDept(managerList);

	}
	/*
	 * @Param managerList contains manager details
	 * 
	 * @return average salary of each department
	 */

	private static void getAvgSalEachDept(List<Manager> managerList) {

		if (managerList != null && managerList.size() > 0) {

			Map<String, Double> avgSalDept = managerList.stream().collect(
					Collectors.groupingBy(Manager::getDepartment, Collectors.averagingDouble(Manager::getSalary)));

			for (Map.Entry<String, Double> entry : avgSalDept.entrySet()) {
				System.out.println(
						"Department name = " + entry.getKey() + ", Department avg salary = " + entry.getValue());
			}

		}

	}

	/**
	 * @param managerList
	 * @author upatra
	 * @return managerList after filtering and return the names
	 */
	private static List<Manager> getEmpName(List<Manager> managerList) {

		if (managerList != null && managerList.size() > 0) {
			managerList.stream().filter(manager -> manager.getYearOfJoining() > 2015).map(Manager::getName)
					.collect(Collectors.toList()).forEach(manager -> System.out.println(manager));
			return managerList;
		}
		return managerList;

	}

	private static void getNameOfAllDepartment(final List<Manager> managerList) {
		// TODO Auto-generated method stub

		if (managerList != null) {
			managerList.stream().map(Manager::getDepartment).collect(Collectors.toList())
					.forEach(data -> System.out.println(data));
		}

	}

}
