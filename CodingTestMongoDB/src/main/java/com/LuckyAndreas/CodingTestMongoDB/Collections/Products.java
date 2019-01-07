package com.LuckyAndreas.CodingTestMongoDB.Collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Products")
public class Products {

	@Id
	private Long _id;
	private String ProductName;
	private Double UnitPrice;
	private char InStock;
	
	public Long get_id() {
		return _id;
	}
	public void set_id(Long _id) {
		this._id = _id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public Double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		UnitPrice = unitPrice;
	}
	public char getInStock() {
		return InStock;
	}
	public void setInStock(char inStock) {
		InStock = inStock;
	}
	
	
}
