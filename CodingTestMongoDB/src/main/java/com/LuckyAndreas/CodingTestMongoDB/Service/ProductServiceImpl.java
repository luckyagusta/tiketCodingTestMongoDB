package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Products;
import com.LuckyAndreas.CodingTestMongoDB.Repository.ProductsRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductsRepository prodRepository;
	
	@Override
	public void uploadProduct(List<Products> products) {
		for (Products product : products) {
			prodRepository.save(product);
		}
		
	}

	@Override
	public Products findProduct(Long productID) {
		Products prod = prodRepository.findById(productID).get();
		return prod;
	}

}
