package org.example.dataStructure.list;

import java.math.BigDecimal;

public class ListUtil {
    public static BigDecimal getAmount(){
        return new BigDecimal(2.00);
    }
    public static BigDecimal getTransformedAmount(BigDecimal input){
        return input.multiply(new BigDecimal(3.00));
    }

    public static BigDecimal addBigDecimal(BigDecimal accumulator, BigDecimal newinput) {
        return accumulator.add(newinput);
    }
}
