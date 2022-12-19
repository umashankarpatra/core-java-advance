package com.corejava.java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //Simple Predicate
        // Creating predicate
        Predicate<Integer> lesserThan = i -> (i < 45);

        // Calling Predicate method
        System.out.println(lesserThan.test(22));
        System.out.println(lesserThan.test(80));

        //Predicate chaining

        Predicate<Integer> greaterThan = i -> (i > 30);
        System.out.println("Age in between 30 to 45 :: " + lesserThan.and(greaterThan).test(40));

        //Predicate as function argument

        pred(100, (i) -> i <=18);
    }

    private static void pred(int number, Predicate<Integer> p) {
        if (p.test(number)) {
            System.out.println("Not Eligible for Vote");
        } else {
            System.out.println("Eligible for Vote");
        }
    }
}
