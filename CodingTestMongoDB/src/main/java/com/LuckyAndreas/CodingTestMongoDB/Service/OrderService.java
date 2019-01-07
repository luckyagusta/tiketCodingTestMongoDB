package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Orders;

public interface OrderService {
	public void uploadOrder(List<Orders> order);
	public Orders findOrder(Long orderID);
}
