package com.pricecompare.pricecompare_new.controller;

import com.pricecompare.pricecompare_new.entity.Product;
import com.pricecompare.pricecompare_new.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{name}")
    public List<Product> getProductsByPath(@PathVariable String name) {
        return (List<Product>) productService.getProductByName(name);
    }

    @GetMapping
    public List<Product> getProductsByQuery(@RequestParam String name) {
        return (List<Product>) productService.getProductByName(name);
    }
}
