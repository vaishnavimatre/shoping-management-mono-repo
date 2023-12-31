package org.dnyanyog.services;







import java.util.Optional;

import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;

import org.dnyanyog.entity.Products;

import org.dnyanyog.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductManagementService {

@Autowired
ProductRepository ProductRepo;


public ProductResponse  addUpdateProduct(ProductRequest request){
	ProductResponse response = new ProductResponse();
	  
	Products ProductTable=new Products();
	ProductTable.setPrice(request.getPrice());
	ProductTable.setQuantity(request.getQuantity());
	ProductTable.setProductname(request.getProductname());
	
	ProductTable =ProductRepo.save(ProductTable);
	
	response.setMessage("product added Successfully");
	response.setStatus("Success");
	response.setProductId(ProductTable.getProductId());
	response.setPrice(ProductTable.getPrice());
	response.setProductname(ProductTable.getProductname());

	return response;
	
	
	
}

public ProductResponse  UpdateProduct(Long productId, ProductRequest request){
	ProductResponse response = new ProductResponse();
	  
	Optional<Products>receivedData=ProductRepo.findById(productId);
	if(receivedData.isPresent()) {	
				Products ProductsTable=new Products();
				ProductsTable.setProductId(request.getProductId());
				ProductsTable.setPrice(request.getPrice());
				ProductsTable.setProductname(request.getProductname());
			
		ProductsTable =ProductRepo.save(ProductsTable);
	
	response.setMessage("Product updated Successfully");
	response.setStatus("Success");
	response.setProductId(ProductsTable.getProductId());
	response.setProductname(ProductsTable.getProductname());
	response.setPrice(ProductsTable.getPrice());
	
			}
	return response;
	
	
	
	
	
	
}




}