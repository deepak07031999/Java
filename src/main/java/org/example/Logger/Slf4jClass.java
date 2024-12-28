package org.example.Logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jClass {
    public static final Logger log = LoggerFactory.getLogger(Slf4jClass.class);
    public static void main(String[] args){

        System.out.println("Hello World");
        Integer a =5;
        log.error("Slf4jClass: value of a:"+ a);
        log.debug("Slf4jClass: value of a:"+ a);
        log.info("Slf4jClass: value of a:"+ a);
    }
}

