package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductData {
	private String productname;
	private String quantity;
	private String price;
	private long productId;
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
}
