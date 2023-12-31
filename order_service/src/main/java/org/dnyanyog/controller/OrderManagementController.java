package org.dnyanyog.controller;




import org.dnyanyog.dto.Order;
import org.dnyanyog.dto.OrderRequest;
import org.dnyanyog.dto.OrderResponse;
import org.dnyanyog.services.OrderManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderManagementController {

	@Autowired
	OrderManagementService orderService;
	
	@PostMapping
	(path="/auth/Order",consumes={"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public OrderResponse PlaceOrderRequest(@RequestBody OrderRequest OrderRequest)
	{
		return orderService.PlaceOrderRequest(OrderRequest);
	}
	@DeleteMapping(path="/auth/deleteorder/{OrderId}")
	public void deletetSingleOrder(@PathVariable Long OrderId) {
		orderService.deleteSingleOrder(OrderId);
	}
}


