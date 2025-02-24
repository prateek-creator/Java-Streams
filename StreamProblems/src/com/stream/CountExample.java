package com.stream;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(34,35,38,45,51,54,98);

        Long count=nums.stream().filter(num->num>50).count();

        System.out.println(count);
    }
}
