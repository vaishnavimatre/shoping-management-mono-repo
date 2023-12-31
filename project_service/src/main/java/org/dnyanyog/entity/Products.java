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
public class Products { //Table

	@GeneratedValue
	@Id
	@Column
	private long productId;
	
	
	@Column
	private String productname;
	
	
	@Column
	private String quantity;
	

	@Column
	private String price;

	
	

	
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
