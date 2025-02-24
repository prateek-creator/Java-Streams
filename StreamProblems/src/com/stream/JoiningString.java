package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningString {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("parteek","shivam","akshay","rudra");

        //Collectors.joining(delimeter) :- Returns a Collector that concatenates the input elements, separated by the specified delimiter, in encounter order.
        String name=names.stream().collect(Collectors.joining(", "));

        System.out.println(name);
    }
}
