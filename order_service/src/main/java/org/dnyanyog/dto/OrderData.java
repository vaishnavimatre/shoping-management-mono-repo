package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class OrderData {
	private String[] productIds;
	private int quantity;
	private int Totalprice;
	private long OrderId;
	
	public String[] getProductIds() {
		return productIds;
	}
	public void setProductIds(String[] productIds) {
		this.productIds = productIds;
	}
	public int getTotalprice() {
		return Totalprice;
	}
	public void setTotalprice(int totalprice) {
		Totalprice = totalprice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getOrderId() {
		return OrderId;
	}
	public void setOrderId(long orderId) {
		OrderId = orderId;
	}



}
