package org.example.dataStructure.list;

import java.math.BigDecimal;
import java.util.List;

public class ListMapReduce {
    public static void main(String[] args){
        System.out.println("Hello world");
        List<Order> orders = getOrders();
        BigDecimal totalPrice = orders.stream()
                .map(Order::getProducts)
                .flatMap(List::stream)
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(totalPrice);
        orders.forEach(Order::displayProducts);

        System.out.println(Order.getSomeTempValue());
        System.out.println(orders.get(0).getSomeTempValue());
    }

    private static List<Order> getOrders(){
        return List.of(
                new Order("Customer1", List.of(
                        new Product("Brand1","Product1", new BigDecimal("1.00")),
                        new Product("Brand2", "Product2", new BigDecimal("2.00"))
                )),
                new Order("Customer2",List.of(
                        new Product("Brand2", "Product2", new BigDecimal("2.00")),
                        new Product("Brand3", "Product3", new BigDecimal("3.00"))
                ))
        );
    }

}
