package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductDao 
{
	public Product addProducts(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Integer id);
	public Product update(Product product);

   

}
