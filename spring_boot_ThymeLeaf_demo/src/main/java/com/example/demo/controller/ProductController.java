package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller

public class ProductController
{
	private ProductService productService;
    @Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
    @RequestMapping("/products")
    public String getAllProducts(Model model)
    {
    	model.addAttribute("products", productService.getAllProducts());
    	return "products";
    }
    @RequestMapping("/product/new")
    public String newProduct(Model model)
    {
        model.addAttribute("product", new Product());
        return "productform";
    }
    
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveProduct(Product product)
    {
        Product save = productService.addProducts(product);
        return "redirect:/products/";
    }
    
    @RequestMapping("/product/{id}")
    public String getProduct(@PathVariable Integer id, Model model)
    {
        model.addAttribute("product", productService.getProductById(id));
        return "product";
    }

    
	

}
