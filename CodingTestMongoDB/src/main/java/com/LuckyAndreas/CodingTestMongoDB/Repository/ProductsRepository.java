package com.LuckyAndreas.CodingTestMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Products;

public interface ProductsRepository extends MongoRepository<Products, Long> {
}
