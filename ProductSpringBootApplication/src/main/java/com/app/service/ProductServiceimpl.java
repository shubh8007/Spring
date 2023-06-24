package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Entity.Product;
import com.app.dao.ProductDao;
@Service
@Transactional
public class ProductServiceimpl implements ProductService {
	@Autowired
private ProductDao prodDao;
	@Override
	public List<Product> getAllProducts() {
		System.out.println("In getAllproduct method");
		return prodDao.findAll();
	}
	@Override
	public Product addProduct(Product prod) {
		// TODO Auto-generated method stub
		return null;
	}

}
