package com.example.demo.stream;


import java.util.function.Predicate;

public class StreamDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t > 7;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(6));
    }

}
