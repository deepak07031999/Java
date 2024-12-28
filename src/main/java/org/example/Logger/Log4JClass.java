package org.example.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JClass {
    public static final Logger log = LogManager.getLogger(Log4JClass.class);
    public static void main(String[] args){

        System.out.println("Hello World");
        Integer a =5;
        log.error("value of a:"+ a);
        log.debug("value of a:"+ a);
        log.info("value of a:"+ a);
    }
}
