package org.example.dataStructure.string;

public class StringClass {
    public static void main(String[] args){

        String input1 = "Hello";
        String input2 = "Hello";
        System.out.println(input1 == input2);

        String input3 = new String("Hello");
        String input4 = new String("Hello");
        System.out.println(input3 == input4);

        String input5 = new String("Hello");
        String input6 = new String("Hello");

        input5 = input5.intern();
        input6 = input6.intern();
        System.out.println(input5 == input6);
    }
}
