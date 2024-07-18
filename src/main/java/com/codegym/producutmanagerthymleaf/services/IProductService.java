package com.codegym.producutmanagerthymleaf.services;

import com.codegym.producutmanagerthymleaf.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
