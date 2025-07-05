package com.pricecompare.pricecompare_new.repository;

import com.pricecompare.pricecompare_new.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List; // ✅ Required for List

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameIgnoreCase(String name); // ✅ Return list instead of optional single
}
