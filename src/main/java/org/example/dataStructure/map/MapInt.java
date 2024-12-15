package org.example.dataStructure.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapInt {
    static String[] input = {"1", "2", "3"};
    public static void main(String[] args){
        List<Integer> inputNums = Arrays
                .stream(input)
                .mapToInt(Integer::parseInt)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(inputNums);
    }
}
