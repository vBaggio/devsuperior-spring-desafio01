package com.vbaggio.desafio_01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vbaggio.desafio_01.entities.Order;
import com.vbaggio.desafio_01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	private void print(Order order) {
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: " + String.format("R$ %.2f", orderService.total(order)));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order[] orders = {
			    new Order(1034, 150.00, 20.0),
			    new Order(2282, 800.00, 10.0),
			    new Order(1039, 95.90, 0.0)
			};
		
		Arrays.stream(orders).forEach(this::print);
	}

}
