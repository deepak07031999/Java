package org.example.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

    public static void main (String[] args) throws IOException {
        System.out.println("Enter any value");
        InputStreamReader inputStreamReader= new InputStreamReader(System.in);
        BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
        String response =  bufferedReader.readLine();
        System.out.println("Number enterd is: " + response);
        Integer responseInInteger = Integer.parseInt(response);
        System.out.println("Number in integer: " + responseInInteger);
    }
}
