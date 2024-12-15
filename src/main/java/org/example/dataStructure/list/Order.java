package org.example.dataStructure.list;

import java.util.List;
import lombok.Getter;

@Getter
public class Order {
    private final String customer;
    private final List<Product> products;
    @Getter
    private static String someTempValue;

    Order(String customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        someTempValue = "someTempValue";
    }

    public void displayProducts() {
        System.out.println("Customer: " + this.customer);
        this.products
                .forEach(product -> System.out.println(product.getBrand() + " " + product.getName() + " " + product.getPrice()));
        System.out.println();
    }
}
