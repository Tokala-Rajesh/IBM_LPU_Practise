package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entity.Product;
@EnableTransactionManagement
@Repository
public class ProductDaoImpl implements ProductDao
{
	private EntityManager em;
	
    @Autowired
	public ProductDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}


	@Override
	@Transactional
	public List<Product> getAllProducts() 
	{
		TypedQuery query = em.createQuery("from Product",Product.class);
		return query.getResultList();
	}


	


	@Override
	@Transactional
	public Product addProducts(Product product) 
	{
		em.persist(product);
		return product;
	}
		// TODO Auto-generated method stub
		


	@Override
	@Transactional
	public Product getProductById(Integer id)
	{
		
		// TODO Auto-generated method stub
		return em.find(Product.class, id);
	}
	

}
