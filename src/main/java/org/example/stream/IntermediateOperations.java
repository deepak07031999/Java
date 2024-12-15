package org.example.stream;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;

public class IntermediateOperations {
    public static void performIntermediateOperations(){
        mapOperation();
        filterOperation();
        sortedOperation();
        sortedCustomOperation();
        flatMapOperation();
        distinctOperation();
        peekOperation();
    }

    private static void mapOperation() {
        System.out.println("mapOperation");
        List<String> list = List.of("a","b");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void filterOperation() {
        System.out.println("filterOperation");
        List<String> list = List.of("a", "b");
//        list.stream()
//                .filter(s -> s.equals("a"))
//                .forEach(System.out::println);
        list.stream()
                .filter(IntermediateOperations::filterOperation)
                .forEach(System.out::println);
    }
    private static boolean filterOperation(String input){
        return input.equals("a");
    }

    private static void sortedOperation() {
        System.out.println("sortedOperation");
        List<String> list= new ArrayList<>(List.of("b", "z","a"));
        list.stream()
                .sorted()
                .forEach(System.out::println);

    }
    private static void sortedCustomOperation() {
        System.out.println("sortedCustomOperation");
        List<String> list= new ArrayList<>(List.of("ab", "a","ac"));
        list.stream()
                .sorted(IntermediateOperations::myComparator)
                .forEach(System.out::println);

    }

    private static int myComparator(String s1, String s2) {
        int length = min(s1.length(),s2.length());
        for (int i=0; i<length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) < s2.charAt(i)? -1:1;

            }
        }
        if (s1.length() != s2.length()) {
            return s1.length() < s2.length()? -1:1;
        }
        return 0;
    }

    private static void flatMapOperation() {
        System.out.println("flatMapOperation");
        List<List<String>> listOfList = List.of(List.of("a", "b"), List.of("c", "d"));
        listOfList.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    private static void distinctOperation() {
        System.out.println("distinctOperation");
        List<String> list = List.of("a", "b", "a");
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void peekOperation() {
        System.out.println("peekOperation");
        List<String> list = List.of("a", "b", "a");
        List<String> result = new ArrayList<>();
        list.stream()
                .peek(result::add)
                .forEach(input-> {});
        System.out.println(result);
    }

}
