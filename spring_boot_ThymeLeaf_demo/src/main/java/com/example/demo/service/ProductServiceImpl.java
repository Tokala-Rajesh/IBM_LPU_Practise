package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
@Service
public class ProductServiceImpl implements ProductService 
{
	private ProductDao productDao;
	
    @Autowired
	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}


	@Override
	public Product addProducts(Product product)
	{
		return productDao.addProducts(product);
		// TODO Auto-generated method stub
		
	}


	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}


	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return productDao.update(product);
	}

}
