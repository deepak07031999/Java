package org.example.utilities;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("true");
        System.out.println(System.getenv());
        System.out.println(System.getLogger("test"));
        System.out.println(System.currentTimeMillis());
        System.out.println(new Timestamp(System.currentTimeMillis()));
        System.out.println(new Timestamp(System.currentTimeMillis()));
    }
}