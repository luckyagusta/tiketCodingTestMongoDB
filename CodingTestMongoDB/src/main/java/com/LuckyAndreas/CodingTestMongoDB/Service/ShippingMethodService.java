package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import com.LuckyAndreas.CodingTestMongoDB.Collections.ShippingMethods;

public interface ShippingMethodService {
	public void uploadShippingMethod(List<ShippingMethods> shippingMethods);
	public ShippingMethods findSM(Long smID);
}
