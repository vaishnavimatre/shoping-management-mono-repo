package org.dnyanyog.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;




import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table
public class Orders { //Table

	@GeneratedValue
	@Id
	@Column
	private long OrderId;
	
	@Column
	private String[] productIds;
	

	
	public long getOrderId() {
		return OrderId;
	}


	public void setOrderId(long orderId) {
		OrderId = orderId;
	}



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


	public int getTotalprice() {
		return Totalprice;
	}


	public void setTotalprice(int totalprice) {
		Totalprice = totalprice;
	}


	@Column
	private int quantity;
	

	@Column
	private int Totalprice;



	
	
}
