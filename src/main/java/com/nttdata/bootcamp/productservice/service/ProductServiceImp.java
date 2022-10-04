package com.nttdata.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.cloud.context.config.annotation.*;

import com.nttdata.bootcamp.productservice.dto.Product;

@RefreshScope
@Service
public class ProductServiceImp implements ProductServiceI {
	
	
	@Autowired
	Environment environment;
	
	@Value("${some.value}")
	private String myValue;

	@Override
	public Product getProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("GET");
		product.setPort(environment.getProperty("local.server.port"));
		product.setValue(myValue);
		return product;
	}
	
	@Override
	public Product postProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("POST");
		product.setPort(environment.getProperty("local.server.port"));
		product.setValue(myValue);
		return product;
	}

}
