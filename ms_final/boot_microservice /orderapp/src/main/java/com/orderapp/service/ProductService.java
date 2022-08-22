package com.orderapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orderapp.dto.Product;

@Service
public class ProductService {
	

	@Autowired
	private RestTemplate restTemplate;
	
	public Product getProduct(int productId) {
		Product product=restTemplate
				.getForObject("http://PRODUCT-APP/productapp/products/"+productId, Product.class);
		return product;
	}

}
