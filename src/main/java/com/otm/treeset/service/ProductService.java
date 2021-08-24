package com.otm.treeset.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.otm.treeset.entities.Product;
@Service
public interface ProductService {

	public Product products(Product product);
}
