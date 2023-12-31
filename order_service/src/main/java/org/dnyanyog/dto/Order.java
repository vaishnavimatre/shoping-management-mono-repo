package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class Order extends OrderData{
	
	private String status;
	private String message;
	private long OrderId;
	
	
	public long getOrderId() {
		return OrderId;
	}
	public void setOrderId(long OrderId ) {
		this.OrderId = OrderId;
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
