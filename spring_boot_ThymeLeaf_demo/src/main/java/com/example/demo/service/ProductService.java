package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService 
{
	public Product addProducts(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Integer id);
	public Product update(Product product) ;


}
