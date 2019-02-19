package com.yorbit.shoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorbit.shoppingCart.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
