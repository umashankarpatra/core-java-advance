package com.corejava.java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 45);

        // Calling Predicate method
        System.out.println(lesserthan.test(22));
        System.out.println(lesserthan.test(80));
    }
}
