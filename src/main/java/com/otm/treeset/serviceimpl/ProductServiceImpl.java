package com.otm.treeset.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otm.treeset.entities.Product;
import com.otm.treeset.repository.ProductRepository;
import com.otm.treeset.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository ProductRepository;

	@Override
	public Product products(Product product) {
		return ProductRepository.save(product);
	}

}
