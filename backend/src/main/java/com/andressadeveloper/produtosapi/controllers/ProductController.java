package com.andressadeveloper.produtosapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andressadeveloper.produtosapi.dtorequest.ProductDTO;
import com.andressadeveloper.produtosapi.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public Page<ProductDTO> findAll(Pageable pageable){
		return productService.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id){
		return productService.findById(id);
	}

}