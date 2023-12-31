package org.dnyanyog.services;







import java.util.Optional;




import org.dnyanyog.dto.Order;
import org.dnyanyog.dto.OrderRequest;
import org.dnyanyog.dto.OrderResponse;
import org.dnyanyog.entity.Orders;

import org.dnyanyog.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderManagementService {

@Autowired
OrderRepository orderRepo;


public OrderResponse  PlaceOrderRequest(OrderRequest request){
	OrderResponse response = new OrderResponse();
	  
	Orders OrderTable=new Orders();
	OrderTable.setProductIds(request.getProductIds());
	OrderTable.setQuantity(request.getQuantity());
	OrderTable =orderRepo.save(OrderTable);
	
	response.setMessage("Order added Successfully");
	response.setStatus("Success");
	response.setProductIds(OrderTable.getProductIds());
	response.setTotalprice(3000);
	response.setOrderId(1);

	return response;
	
	
	
}

public void deleteSingleOrder(Long OrderId) {
	OrderResponse response = new OrderResponse();
	Optional<Orders>receivedData=orderRepo.findById(OrderId);
	if(receivedData.isPresent()) {
		orderRepo.deleteById(OrderId);
	//	response.setOrderId(OrderId);
			//	response.setStatus("Success");
			//	response.setMessage("User deleted Successfully");
		
				//return userResponse;
			}
	
	
}


	

}

