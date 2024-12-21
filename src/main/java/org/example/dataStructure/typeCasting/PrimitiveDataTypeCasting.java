package org.example.dataStructure.typeCasting;

import java.io.PrintStream;

public class PrimitiveDataTypeCasting {

    private static final int input = 257;

    public static void main(String[] args){
        downCasting();
        upCasting();
    }

    public static void downCasting() {

        byte downCastedInput = (byte) input;
        System.out.println(input);
        System.out.println(downCastedInput);
    }

    public static void upCasting() {

        float upCastedInput = input;
        System.out.println(input);
        System.out.println(upCastedInput);

    }
}
