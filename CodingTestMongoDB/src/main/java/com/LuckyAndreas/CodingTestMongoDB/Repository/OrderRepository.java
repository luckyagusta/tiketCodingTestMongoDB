package com.LuckyAndreas.CodingTestMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Orders;

public interface OrderRepository extends MongoRepository<Orders, Long> {

}
