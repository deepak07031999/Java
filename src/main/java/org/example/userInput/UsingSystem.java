package org.example.userInput;

import java.io.IOException;

public class UsingSystem {
    public static void main (String[] args) throws IOException {
        System.out.println("Enter any value");
        int response = System.in.read();
        System.out.println("Number enterd is: " + response);
    }
}
