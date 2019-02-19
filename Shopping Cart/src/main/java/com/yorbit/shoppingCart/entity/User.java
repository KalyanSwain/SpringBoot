package com.yorbit.shoppingCart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	private String id;
	@OneToOne
	private Cart cart;
	

}
