package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;

public interface CustomerService {
	public void uploadCustomer(List<Customers> customers);
	public Customers findCustomer(Long customerID);
}
