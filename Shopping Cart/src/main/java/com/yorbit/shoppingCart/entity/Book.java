package com.yorbit.shoppingCart.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Book extends Product {

	private String genre;
	private String author;
	private String publication;

	public Book(int prodId, String prodName, float price, String genre, String author, String publication) {
		super.id = prodId;
		super.prodName = prodName;
		super.price = price;
		this.genre = genre;
		this.author = author;
		this.publication = publication;
	}

	public Book() {
	}
}
