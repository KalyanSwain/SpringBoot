package com.yorbit.shoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yorbit.shoppingCart.entity.Apparel;
import com.yorbit.shoppingCart.repository.ApparelRepository;

@Repository
public class ApparelService {
	
	@Autowired
	private ApparelRepository apparelRepository;
	public void saveApparel(Apparel apparel)
	{
		apparelRepository.save(apparel);
	}
	public List<Apparel> viewAll()
	{
		return apparelRepository.findAll();
	}
	

}
