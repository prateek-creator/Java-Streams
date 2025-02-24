package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingString {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Prateek","Abhishek","Narayan","Narendra","Harman");

        List<String> sortedNames=names.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}
