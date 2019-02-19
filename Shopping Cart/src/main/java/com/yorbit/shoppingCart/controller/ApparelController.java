package com.yorbit.shoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yorbit.shoppingCart.entity.Apparel;
import com.yorbit.shoppingCart.service.ApparelService;

@RestController
@RequestMapping(value = "/apparels")
public class ApparelController {
	@Autowired
	private ApparelService apparelDao;

	@PostMapping
	public void addApparel(@RequestBody Apparel apparel) {

		apparelDao.saveApparel(apparel);

	}

	@GetMapping
	public List<Apparel> getAll() {
		return apparelDao.viewAll();
	}

}
