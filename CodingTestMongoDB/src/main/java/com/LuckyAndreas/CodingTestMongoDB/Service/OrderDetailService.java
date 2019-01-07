package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import com.LuckyAndreas.CodingTestMongoDB.Collections.OrderDetails;

public interface OrderDetailService {
	public void uploadOrderDetail (List<OrderDetails> ods);
}
