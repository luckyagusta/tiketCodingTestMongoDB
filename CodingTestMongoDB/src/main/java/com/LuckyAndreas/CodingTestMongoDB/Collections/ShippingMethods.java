package com.LuckyAndreas.CodingTestMongoDB.Collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Shipping_Methods")
public class ShippingMethods {
	@Id
	private Long _id;
	private String ShippingMethod;
	
	public Long get_id() {
		return _id;
	}
	public void set_id(Long _id) {
		this._id = _id;
	}
	public String getShippingMethod() {
		return ShippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		ShippingMethod = shippingMethod;
	}
	@Override
	public String toString() {
		return "ShippingMethods [_id=" + _id + ", ShippingMethod=" + ShippingMethod + "]";
	}
	
	
	
	
}
