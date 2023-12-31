package org.dnyanyog.controller;

import org.apache.catalina.connector.Response;

import org.dnyanyog.dto.Product;
import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;

import org.dnyanyog.services.ProductManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductManagementController {

	@Autowired
	ProductManagementService productService;
	
	@PostMapping
	(path="/auth/Product",consumes={"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public ProductResponse addUpdateProduct(@RequestBody ProductRequest ProductRequest)
	{
		return productService.addUpdateProduct(ProductRequest);
	}
	@PostMapping
	(path="/auth/updateProduct/{ProductId}",consumes={"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public ProductResponse UpdateProduct(@RequestBody ProductRequest productRequest,@PathVariable Long ProductId)
	{
		return productService.UpdateProduct( ProductId,productRequest);
	}
}
