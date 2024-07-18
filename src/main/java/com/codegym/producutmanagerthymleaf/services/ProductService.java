package com.codegym.producutmanagerthymleaf.services;

import com.codegym.producutmanagerthymleaf.model.Product;
import com.codegym.producutmanagerthymleaf.repositories.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

    private ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
