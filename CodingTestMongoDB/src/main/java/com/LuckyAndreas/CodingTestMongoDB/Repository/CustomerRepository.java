package com.LuckyAndreas.CodingTestMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;

public interface CustomerRepository  extends MongoRepository<Customers, Long>{
}
