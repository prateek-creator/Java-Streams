package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,0,19);

        //to print even numbers from list
        List<Integer> evenNumbers=numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //find maximum and minimum number
        int max1=numbers.stream().max((x,y)->Integer.compare(x,y)).get();
        //or we can also use method referrence
        int max2= numbers.stream().max(Integer::compare).get();
        System.out.println(max1);
        System.out.println(max2);
    }
}
