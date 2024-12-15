package org.example.dataStructure.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapClass {
    static String[] input = {"1", "2", "3"};
    public static void main(String[] args){
        List<Integer> inputNums = Arrays
                .stream(input)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(inputNums);
    }
}
