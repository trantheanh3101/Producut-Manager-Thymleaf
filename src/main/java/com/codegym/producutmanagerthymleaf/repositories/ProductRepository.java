package com.codegym.producutmanagerthymleaf.repositories;

import com.codegym.producutmanagerthymleaf.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Car Model A", 50000.0, "Luxury car with advanced features", "Manufacturer X"));
        products.put(2, new Product(2, "Car Model B", 35000.0, "Sporty compact car for city driving", "Manufacturer Y"));
        products.put(3, new Product(3, "Truck Model C", 70000.0, "Heavy-duty truck for industrial use", "Manufacturer Z"));
        products.put(4, new Product(4, "SUV Model D", 45000.0, "Family-friendly SUV with spacious interior", "Manufacturer W"));
        products.put(5, new Product(5, "Motorcycle Model E", 15000.0, "Fast and agile motorcycle for urban commuting", "Manufacturer V"));
        products.put(6, new Product(6, "Electric Car Model F", 60000.0, "Environmentally friendly electric car with high range", "Manufacturer U"));
        products.put(7, new Product(7, "Luxury Sedan Model G", 80000.0, "Elegant sedan with luxurious interior features", "Manufacturer T"));
        products.put(8, new Product(8, "Sports Car Model H", 90000.0, "High-performance sports car for enthusiasts", "Manufacturer S"));
        products.put(9, new Product(9, "Compact Hatchback Model I", 25000.0, "Compact car with efficient fuel consumption", "Manufacturer R"));
        products.put(10, new Product(10, "Pickup Truck Model J", 65000.0, "Versatile pickup truck for various uses", "Manufacturer Q"));
    }


    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
}
