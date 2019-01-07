package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LuckyAndreas.CodingTestMongoDB.Collections.OrderDetails;
import com.LuckyAndreas.CodingTestMongoDB.Repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	private OrderDetailRepository odRepo;
	
	@Override
	public void uploadOrderDetail(List<OrderDetails> ods) {
		for (OrderDetails orderDetails : ods) {
			odRepo.save(orderDetails);
		}	
	}

}
