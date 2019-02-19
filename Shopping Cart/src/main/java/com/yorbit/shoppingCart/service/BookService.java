package com.yorbit.shoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yorbit.shoppingCart.entity.Book;
import com.yorbit.shoppingCart.repository.BookRepository;

@Repository
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public List<Book> getAll() {
		
		return (bookRepository.findAll());
	}
}
