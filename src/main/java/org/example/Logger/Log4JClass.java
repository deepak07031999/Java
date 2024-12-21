package org.example.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.utilities.LogUtil;

public class Log4JClass {

    public static void main(String[] args){

        System.out.println("Hello World");
        Integer a =5;
        LogUtil.log.error("value of a:"+ a);
        LogUtil.log.debug("value of a:"+ a);
        LogUtil.log.info("value of a:"+ a);
    }
}
