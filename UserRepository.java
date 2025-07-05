package com.pricecompare.pricecompare_new.repository;

import com.pricecompare.pricecompare_new.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<user, Integer> {
    Optional<user> findByUsernameAndPassword(String username, String password);
}
