package com.vbaggio.desafio_01.services;

import org.springframework.stereotype.Service;

import com.vbaggio.desafio_01.entities.Order;

@Service
public class ShippingService {
	
	public Double shipping(Order order) {
		if(order.getBasic() < 100)
			return 20.00;
		
		if(order.getBasic() < 200)
			return 12.00;
		
		return 0.00;					
	}

}
