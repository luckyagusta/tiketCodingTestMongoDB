package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Orders;
import com.LuckyAndreas.CodingTestMongoDB.Repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public void uploadOrder(List<Orders> order) {
		for (Orders orders : order) {
			orderRepo.save(orders);
		}
		
	}

	@Override
	public Orders findOrder(Long orderID) {
		Orders od = orderRepo.findById(orderID).get();
		return od;
	}

}
