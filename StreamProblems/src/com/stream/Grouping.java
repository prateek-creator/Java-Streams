package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,0,19);



        /*Returns a Collector which partitions the input elements according to a Predicate, and organizes them into a Map<Boolean, List<T>>.
        The returned Map always contains mappings for both false and true keys. There are no guarantees on the type, mutability, serializability,
        or thread-safety of the Map or List returned.

        Params: predicate – a predicate used for classifying input elements
        Returns: a Collector implementing the partitioning operation*/

        Map<Boolean,List<Integer>> evenOddMap =numbers.stream().collect(Collectors.partitioningBy(e->e%2==0));

        System.out.println("even list "+evenOddMap.get(true));
        System.out.println("odd list "+evenOddMap.get(false));
    }
}
