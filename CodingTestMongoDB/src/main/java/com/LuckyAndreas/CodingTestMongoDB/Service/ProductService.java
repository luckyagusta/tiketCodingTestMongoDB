package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Products;

public interface ProductService {
	public void uploadProduct(List<Products> products);
	public Products findProduct(Long productID);
}
