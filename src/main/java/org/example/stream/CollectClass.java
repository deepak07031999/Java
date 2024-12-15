package org.example.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class CollectClass {
    public static void  main(String[] args){
        toList();
        toSet();
        toMap();
        groupingBy();
        counting();
    }
    private static void toList(){
        System.out.println("toList");
        List<String> input= List.of("a","a","b","c");
        List<String> ans = input.stream()
                .map(ele -> ele + "a")
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void toSet(){
        System.out.println("toSet");
        List<String> input= List.of("a","a","b","c");
        Set<String> ans = input.stream()
                .map(ele -> ele + "a")
                .collect(Collectors.toSet());
        System.out.println(ans);
    }

    private static void toMap(){
        System.out.println("toMap");
        List<String> input = List.of("a","b","c");
        AtomicReference<Integer> i = new AtomicReference<>(0);
        Map<Integer, String> ans = input.stream()
                .collect(Collectors.toMap(ele -> i.getAndSet(i.get() + 1) , ele -> ele));
        System.out.println(ans);
    }

    private static void groupingBy(){
        System.out.println("groupingBy");
        List<String> input = List.of("a","a","b","c");
        Map<Integer, List<String>> ans =input.stream()
                .collect(Collectors.groupingBy(ele -> ele.length()));
        System.out.println(ans);
    }

    private static void counting(){
        System.out.println("counting");
        List<String> input = List.of("a","a","b","c");
        Map<String, Long> ans = input.stream()
                .collect(Collectors.groupingBy(ele -> ele,Collectors.counting()));
        System.out.println(ans);
    }

}
