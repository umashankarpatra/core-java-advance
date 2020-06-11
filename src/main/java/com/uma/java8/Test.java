package com.uma.java8;

public class Test {

	/*
	 * Write a lambda function that takes a String and Integer and return an Integer
	 * by adding all string character values and the passed integral value
	 */

	public static void main(String[] args) {
		inputs addIntegerAndString = (int x, String name) -> {
			return x + sum(name);
		};

		System.out.println(addIntegerAndString.takeInputs(2, "yogesh"));
	}

	private static int sum(String name) {
		if (name.isEmpty()) {
			return 0;
		}
		int sum = 0;
		for (char c : name.toCharArray()) {
			sum = +(int) c;
		}
		return sum;
	}

}
