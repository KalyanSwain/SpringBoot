package com.yorbit.shoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yorbit.shoppingCart.entity.Cart;
import com.yorbit.shoppingCart.entity.Product;
import com.yorbit.shoppingCart.repository.CartRepository;

@Repository
public class CartService {
	@Autowired
	private CartRepository cartRepository;

	public void addToCart(String userId, Product product) {

		Cart cart = cartRepository.findById(userId).get();
		cart.getProducts().add(product);
		cartRepository.save(cart);

	}

	public Cart getCart(String cartId) {
		float price=0;
		Cart cart=cartRepository.findById(cartId).get();
		for (Product product : cart.getProducts()) {
			
			price =price+product.getPrice();
		}
		cart.setAmount(price);
		
		return cart;
		

	}

	public List<Product> updateCart(String cartId, Product product) {
		Cart cart = cartRepository.findById(cartId).get();
		for (Product p : cart.getProducts()) {
			if (p.getId() == product.getId()) {
				cart.getProducts().remove(p);
				break;
			}
		}

		cartRepository.save(cart);
		return cartRepository.findById(cartId).get().getProducts();

	}
}
