package org.example.dataStructure.list;

import java.math.BigDecimal;
import lombok.Getter;

@Getter
public class Product {
    private final String brand;
    private final String name;
    private final BigDecimal price;
    Product(String brand, String name, BigDecimal price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

}
