package com.otm.treeset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otm.treeset.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
