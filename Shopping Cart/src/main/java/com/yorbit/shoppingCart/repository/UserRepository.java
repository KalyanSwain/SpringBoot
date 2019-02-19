package com.yorbit.shoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorbit.shoppingCart.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
