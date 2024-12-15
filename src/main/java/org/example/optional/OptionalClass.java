package org.example.optional;

import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        /// initialization
        Optional<String> input1 = Optional.of("Optional value");
        Optional<String> input2 = Optional.empty();
        Optional<String> input3 = Optional.ofNullable("Optional value");

        /// check
        if (input1.isPresent()) {
          System.out.println(input1.get());
        }
        if (input2.isEmpty()) {
          System.out.println("Optional value empty");
        }

        //access
        System.out.println(input1.get());
        System.out.println(input2.orElse("Optional value empty"));
        System.out.println(input2.orElseGet(()-> "Optional value empty using orElseGet"));

        /// ifPresent
        input2.ifPresent(System.out::println);


        /// Transform
        List<String> list = List.of("1","2","3");
        System.out.println(input1.map(OptionalClass::getOutput));
        System.out.println(input1.map(OptionalClass::getOutputOpt));

        optionalChaining();
    }
    private static String getOutput(String input) {
        return input == null ? null : "output for " + input;
    }

    private static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() : Optional.of("output for " + input);
    }

    private static void optionalChaining(){
        Optional<Optional<String>> input = Optional.of(Optional.of("Optional Optional value"));
        Optional<String> ans = input
                .flatMap(value -> value);
        System.out.println(ans.orElse("ok"));
    }

}
