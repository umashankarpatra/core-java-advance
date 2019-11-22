package com.uma.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperation {

	private static Boolean checkLowerOrNot(String fname) {
		if (fname.toLowerCase() == fname) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {

		String name = "umashankar";

		String title = "patra";

		List<String> fullName = new ArrayList<String>();

		fullName.add(name);

		fullName.add(title);

		System.out.println("-->>>" + fullName.stream().filter(fname -> StringOperation.checkLowerOrNot(fname))
				.collect(Collectors.toList()));

	}

}
