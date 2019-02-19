package com.yorbit.shoppingCart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yorbit.shoppingCart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value="select * from product", nativeQuery=true)
	List<Product> findAllProd();
} 
