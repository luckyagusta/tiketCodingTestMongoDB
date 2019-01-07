package com.LuckyAndreas.CodingTestMongoDB.ServiceKafka;

import java.util.List;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;

public interface ProduceService {
	public List<Object> getShippingMethodInUsed();

	public List<Customers> getListCustomer();
	
	public List<Object> getEmployeeByOrder();
	
	public List<Object> getProductByOrder(Long orderID);
	
	public List<Object> getDetailPayment(Long orderID);
}
