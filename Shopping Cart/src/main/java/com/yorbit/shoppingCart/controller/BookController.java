package com.yorbit.shoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yorbit.shoppingCart.entity.Book;
import com.yorbit.shoppingCart.service.BookService;

@RequestMapping(value = "/books")
@RestController
public class BookController {
	@Autowired
	private BookService bookdao;

@PostMapping
	public void adddBook(@RequestBody Book book) {

		bookdao.addBook(book);

	}


@GetMapping
public List<Book> getAll() {
		return bookdao.getAll();

	}
}
