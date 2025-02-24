package com.stream;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,0,19);
        //find maximum number
        int max1=numbers.stream().max((x,y)->Integer.compare(x,y)).get();

        //or we can also use method referrence
        int max2= numbers.stream().max(Integer::compare).get();
        System.out.println(max1);
        System.out.println(max2);

        //find minimum number
        int min=numbers.stream().min(Integer::compare).get();
        System.out.println(min);


    }

}
