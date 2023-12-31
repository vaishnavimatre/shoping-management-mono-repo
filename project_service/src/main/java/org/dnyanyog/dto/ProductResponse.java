package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductResponse {
	
	
private  String status;
private String message;
private  String productname;
private String price;
private  long productId;


public long getProductId() {
	return productId;
}

public void setProductId(long productId) {
	this.productId = productId;
}

public String getProductname() {
	return productname;
}

public void setProductname(String productname) {
	this.productname = productname;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}


	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}