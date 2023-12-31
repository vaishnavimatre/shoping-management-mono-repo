package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class OrderResponse {
	
	
public String[] getProductIds() {
		return productIds;
	}
	public void setProductIds(String[] productIds) {
		this.productIds = productIds;
	}
private  String status;
private String message;
private  String[] productIds;
private int Totalprice;
private  long OrderId;
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

public int getTotalprice() {
	return Totalprice;
}
public void setTotalprice(int totalprice) {
	Totalprice = totalprice;
}
public long getOrderId() {
	return OrderId;
}
public void setOrderId(long orderId) {
	OrderId = orderId;
}


}