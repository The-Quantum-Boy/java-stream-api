package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Partitionong by Predicate - partition the list into even and odd number
public class Test46 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect);
    }
}