package com.yorbit.shoppingCart.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Apparel extends Product {

	private String type;
	private String brand;
	private String design;

	public Apparel(int prodId, String prodName, float price, String type, String brand, String design) {
		super.id = prodId;
		super.prodName = prodName;
		super.price = price;
		this.type = type;
		this.brand = brand;
		this.design = design;
	}

	public Apparel() {
	}
}
