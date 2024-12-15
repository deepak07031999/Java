package org.example.dataStructure.list;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


public class ListTry {
    public static void main(String[] args) {
        List<BigDecimal> test = new ArrayList<BigDecimal>();
        test.add(new BigDecimal(1.00));
        test.add(new BigDecimal(2.00));
        System.out.println(test.get(0));
//        System.out.println(test.stream().mapToInt(Integer::intValue).sum());
        System.out.println(
                test.stream()
                        .map((input)->{return input.multiply(new BigDecimal(2.00));})
                        .reduce(BigDecimal.ZERO, BigDecimal::add));
        System.out.println(
                test.stream()
                        .map(ListUtil::getTransformedAmount)
                        .reduce(BigDecimal.ZERO, BigDecimal::add));
        System.out.println(
                test.stream()
                        .map(ListUtil::getTransformedAmount)
                        .reduce(BigDecimal.ZERO, ListUtil::addBigDecimal));
        for (BigDecimal bigDecimal : test) {
            System.out.println(bigDecimal);
        }

    }
}
