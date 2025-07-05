package com.pricecompare.pricecompare_new.service;

import com.pricecompare.pricecompare_new.entity.Product;
import com.pricecompare.pricecompare_new.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductByName(String name) {
        return productRepository.findByNameIgnoreCase(name);
    }
}
