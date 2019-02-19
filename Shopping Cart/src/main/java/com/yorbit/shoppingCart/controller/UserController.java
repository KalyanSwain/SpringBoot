package com.yorbit.shoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yorbit.shoppingCart.entity.Cart;
import com.yorbit.shoppingCart.entity.Product;
import com.yorbit.shoppingCart.service.CartService;
import com.yorbit.shoppingCart.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private CartService cartService;

	@PostMapping(value = "/{userId}")
	public void addUser(@PathVariable("userId") String userId) {
		userService.createUser(userId);
	}

	@PostMapping(value = "/cart/{userId}")
	public void addToCart(@PathVariable(value = "userId") String userId, @RequestBody Product product) {
		cartService.addToCart(userId, product);
	}

	@GetMapping(value = "/cart/{cartId}")
	public Cart getCart(@PathVariable(value = "cartId") String cartId) {
		return cartService.getCart(cartId);
	}

	@PutMapping(value = "/cart/{cartId}")
	public List<Product> updateCart(@PathVariable(value = "cartId") String cartId, @RequestBody Product product) {
		return cartService.updateCart(cartId, product);
	}
	
	
}
