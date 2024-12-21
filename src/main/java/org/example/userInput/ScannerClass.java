package org.example.userInput;

import java.util.Scanner;

public class ScannerClass {
    public  static void main(String[] args) {
        System.out.println("Enter any value");
        Scanner sc = new Scanner(System.in);
        String response=  sc.nextLine();
        System.out.println("Entered value is: " + response);

    }
}
