package com.codegym.producutmanagerthymleaf.controller;

import com.codegym.producutmanagerthymleaf.model.Product;
import com.codegym.producutmanagerthymleaf.services.IProductService;
import com.codegym.producutmanagerthymleaf.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping
    public String list(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        return "/list";
    }
}
