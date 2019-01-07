package com.LuckyAndreas.CodingTestMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LuckyAndreas.CodingTestMongoDB.Collections.OrderDetails;

public interface OrderDetailRepository extends MongoRepository<OrderDetails, Long> {

}
