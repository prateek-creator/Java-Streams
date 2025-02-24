package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,0,19);

        //to print even numbers from list
        List<Integer> evenNumbers=numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);


    }
}
