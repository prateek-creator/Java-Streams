package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(2,2,1,3,4,2,5,6,6,7,8);

        List<Integer> distinctNums=nums.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctNums);
    }
}
