package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class OrderRequest {


	private String[] productIds;
	
	private int quantity;

	

	public String[] getProductIds() {
		return productIds;
	}

	public void setProductIds(String[] productIds) {
		this.productIds = productIds;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
}
