package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins="http://localhost:3000")
public class ProductController {
@Autowired
private ProductService prodService;


public ProductController() {
	System.out.println("In product controller...");
}
@GetMapping
public List<Product> getAllProductlisy(){
	return prodService.getAllProducts();
}
@PostMapping
public Product addProduct(Product prod) {
	return prodService.addProduct(prod);
	
}
}
