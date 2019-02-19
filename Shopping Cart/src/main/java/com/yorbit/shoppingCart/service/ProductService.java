package com.yorbit.shoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yorbit.shoppingCart.entity.Product;
import com.yorbit.shoppingCart.repository.ProductRepository;

@Repository
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllproducts() {
		return (productRepository.findAll());
	}

	public List<Product> getAllproductsNamed() {
		return (productRepository.findAllProd());
	}

	public Product getProductById(int id) {
		return productRepository.findById(id).get();
	}

	public Product getProductByname(String name) {
		for (Product p : productRepository.findAll()) {
			if (p.getProdName().equalsIgnoreCase(name))
				return p;
		}
		return null;
	}
}
