package com.yorbit.shoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorbit.shoppingCart.entity.Apparel;

public interface ApparelRepository extends JpaRepository<Apparel, Integer> {

}
