package com.nttdata.bootcamp.productservice.service;

import com.nttdata.bootcamp.productservice.dto.Product;

public interface ProductServiceI {

	public Product getProduct(Integer productId);
	public Product postProduct(Integer productId);
}
