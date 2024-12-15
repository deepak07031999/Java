package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {
    public static void performTerminalOperations(){
        collectOperation();
        collectOperation2();

        forEachOperation();
        toListOperation();
        reduceOperation();
        countOperation();

        maxOperation();
        minOperation();

        findFirstOperation();
        findAnyOperation();

        allMatchOperation();
        anyMatchOperation();
        noneMatchOperation();

    }

    private static void collectOperation() {
        System.out.println("collectOperation");
        List<String> list = List.of("a", "b", "c");
        String result= list.stream()
                .collect(StringBuilder:: new,StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(result);
    }

    private static void collectOperation2() {
        System.out.println("collectOperation2");
        String[] input = {"a", "b", "c"};
        List<String> result= Arrays.stream(input)
                .collect(ArrayList:: new,ArrayList::add, ArrayList::addAll);
        System.out.println(result);
    }

    private static void forEachOperation() {
        System.out.println("forEachOperation");
        List<String> list = List.of("a", "b", "c");
        list.stream()
                .forEach(System.out::println);
    }

    private static void toListOperation() {
        System.out.println("toListOperation");
        String[] input = {"a", "b", "c"};
        List<String> result= Arrays.stream(input)
                .toList();
        System.out.println(result);
    }

    private static void reduceOperation() {
        System.out.println("reduceOperation");
        List<Integer> input = List.of(1,2,3);
        Integer answer = input.stream()
                .reduce(0, Integer::sum);
        System.out.println(answer);
    }

    private static void countOperation() {
        System.out.println("countOperation");
        List<String> input = List.of("a","a","b","c");

        /** Only use when you are already
        using stream for the given input**/
        long sizeOfStream = input.stream()
                .count();
        System.out.println(sizeOfStream);
        /// other approach
        long sizeOfStream2 = input.size();
        System.out.println(sizeOfStream2);
    }
    private static void maxOperation() {
        System.out.println("maxOperation");
        List<String> input = List.of("a","aa","ab","ac");

        Optional<String> maxCharacterInStream = input.stream()
                .max(CharSequence::compare);
        maxCharacterInStream.ifPresent(sb -> System.out.println("Max: " + sb));
    }
    private static void minOperation() {
        System.out.println("minOperation");
        List<String> input = List.of("a","aa","ab","ac");

        Optional<String> minCharacterInStream = input.stream()
                .min(CharSequence::compare);
        minCharacterInStream.ifPresent(sb -> System.out.println("Min: " + sb));
    }

    private static void findFirstOperation(){
        System.out.println("findFirstOperation");
        List<String> input = List.of("a","aa","ab","ac");
        Optional<String> firstElement = input.stream().findFirst();
        firstElement.ifPresent(System.out::println);
    }
    private static void findAnyOperation(){
        System.out.println("findAnyOperation");
        List<String> input = List.of("a","aa","ab","ac");
        Optional<String> firstElement = input.stream().findAny();
        firstElement.ifPresent(System.out::println);
    }
    private static void allMatchOperation(){
        System.out.println("allMatchOperation");
        List<String> input = List.of("a","aa","ab","ac");
        boolean allMatches = input.stream().allMatch(ele -> ele.startsWith("a"));
        System.out.println(allMatches);
    }
    private static void anyMatchOperation() {
        System.out.println("anyMatchOperation");
        List<String> input = List.of("a","aa","ab","ac","z");
        boolean anyMatches = input.stream().anyMatch(ele -> ele.startsWith("z"));
        System.out.println(anyMatches);
    }
    private static void noneMatchOperation() {
        System.out.println("noneMatchOperation");
        List<String> input = List.of("a","aa","ab","ac","z");
        boolean noneMatches = input.stream().noneMatch(ele -> ele.startsWith("k"));
        System.out.println(noneMatches);
    }
}
