package com.app.service;

import java.util.List;

import com.app.Entity.Product;

public interface ProductService {
	List<Product>  getAllProducts();
		Product addProduct(Product prod);
	

}
