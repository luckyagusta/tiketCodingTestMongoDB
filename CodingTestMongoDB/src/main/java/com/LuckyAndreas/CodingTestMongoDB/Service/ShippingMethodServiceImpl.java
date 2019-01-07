package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LuckyAndreas.CodingTestMongoDB.Collections.ShippingMethods;
import com.LuckyAndreas.CodingTestMongoDB.Repository.ShippingMethodRepository;

@Service
public class ShippingMethodServiceImpl implements ShippingMethodService{

	@Autowired
	private ShippingMethodRepository smRepo;
	
	@Override
	public void uploadShippingMethod(List<ShippingMethods> shippingMethods) {
		for (ShippingMethods sm : shippingMethods) {
			smRepo.save(sm);
		}
		
	}

	@Override
	public ShippingMethods findSM(Long smID) {
		ShippingMethods sm = smRepo.findById(smID).get();
		return sm;
	}

}
