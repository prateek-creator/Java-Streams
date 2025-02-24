package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,3,4,5,1,6,9,7);

        List<Integer> squaredNumbers=numbers.stream().map(e->e*e).collect(Collectors.toList());

        System.out.println(squaredNumbers);
    }
}
