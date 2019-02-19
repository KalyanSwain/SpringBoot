package com.yorbit.shoppingCart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yorbit.shoppingCart.entity.Cart;
import com.yorbit.shoppingCart.entity.User;
import com.yorbit.shoppingCart.repository.CartRepository;
import com.yorbit.shoppingCart.repository.UserRepository;

@Repository
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CartRepository cartRepository;

	public void createUser(String userId) {
		Cart cart_userId = new Cart();
		cart_userId.setId(userId);
		cartRepository.save(cart_userId);
		User user = new User();
		user.setId(userId);
		user.setCart(cart_userId);
		userRepository.save(user);

	}

}
