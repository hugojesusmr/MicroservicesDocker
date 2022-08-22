package com.example.client;

import com.example.model.Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product-service",path="/products")
public interface ProductClient {
   
    @GetMapping(value ="/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id);
    
    @GetMapping (value = "/{id}/stock")
	public ResponseEntity<Product> updateStockProduct(@PathVariable("id") Long id,@RequestParam(name="quantity", required = true) Double quantity);      
}