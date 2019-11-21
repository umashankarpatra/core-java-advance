package com.uma.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author upatra
 *
 */
public class Java8Stream {
	public static void main(String[] args) {
		System.out.println("--->>>Java8Stream examples");

		concurrentMapNewFeatures();
		returnSetUsingStream();

		filteringWithStreams();
	}

	private static void filteringWithStreams() {
		List<String> values = Arrays.asList("umashankar", "Sailesh", "Kalia", "Jadhu", "Pratap");
		filteringWithStreamsUsingMap();
		/*
		 * List<String> filteredResults = values.stream().filter(s -> s.length() >
		 * 5).collect(Collectors.toList()); System.out.println(filteredResults);
		 */
	}

	private static void returnSetUsingStream() {

		System.out.println("-->returnSetUsingStream{} ");
		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 2, 4, 5, 2);
		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		squareSet.stream().forEach(s -> System.out.println(s));

	}

	private static void filteringWithStreamsUsingMap() {

		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("Sailesh", 23);
		map.put("Ankur", 30);
		map.put("Vibhu", 35);
		map.put("Tarun", 35);
		map.put("Rajveer", 40);

		Map<String, Integer> data = map.entrySet().stream().filter(d -> d.getValue() > 30)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		data.entrySet().stream().forEach(d -> System.out.println("-->>data" + d));

	}

	private static void concurrentMapNewFeatures() {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("One", "One");
		map.put("One1", "One");
		map.put("One11", "One");
		map.put("One111", "One");
		map.put("One1111", "One");

		map.forEachKey(2, k -> k.length(), System.out::println);
	}
}
