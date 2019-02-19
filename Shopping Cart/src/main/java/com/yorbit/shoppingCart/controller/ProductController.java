package com.yorbit.shoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yorbit.shoppingCart.entity.Product;
import com.yorbit.shoppingCart.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping
	public List<Product> getAll() {

		return (productService.getAllproducts());
	}
	@GetMapping(value="/id/{productId}")
	public Product getproduct(@PathVariable("productId") int productId) {
		return (productService.getProductById(productId));
	}
	@GetMapping(value="/name/{productName}")
	public Product getproduct(@PathVariable("productName") String productName) {
		return (productService.getProductByname(productName));
	}

}
