package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface MyEntityRepository extends CrudRepository<Product, String> {
    boolean existsByName(String name);
}
