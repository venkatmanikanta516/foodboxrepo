package com.mjava.foodbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.foodbox.model.Order;
import com.mjava.foodbox.repository.OrderRepository;
@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepo;
	
	public void insertOrderService(Order order)
	
	{
		orderRepo.save(order);
	}

}
