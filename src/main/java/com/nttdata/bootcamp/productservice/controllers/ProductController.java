package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nttdata.bootcamp.productservice.dto.Product;
import com.nttdata.bootcamp.productservice.service.ProductServiceI;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private ProductServiceI productService;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.getProduct(id));
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Product> postProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.postProduct(id));
	}
	


}
