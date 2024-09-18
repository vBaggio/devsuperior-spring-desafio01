package com.vbaggio.desafio_01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbaggio.desafio_01.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	public Double total(Order order) {
		return order.getBasic() - order.getBasic() * order.getDiscount() / 100 + shippingService.shipping(order) ;
	}

}
