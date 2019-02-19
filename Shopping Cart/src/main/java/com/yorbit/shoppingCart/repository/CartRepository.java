package com.yorbit.shoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorbit.shoppingCart.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, String>{

}
