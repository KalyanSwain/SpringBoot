package com.yorbit.shoppingCart.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class Cart {
	@Id
	public String id;
//	@OneToOne
//	private User user;
	 @ManyToMany(targetEntity=Product.class)
	private List<Product> products;
	 @Transient
	 private float amount;
}
