package com.otm.treeset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.otm.treeset.entities.Product;
import com.otm.treeset.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productServiceimpl;

	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productServiceimpl.products(product), HttpStatus.OK);
	}

}
