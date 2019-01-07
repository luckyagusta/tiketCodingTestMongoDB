package com.LuckyAndreas.CodingTestMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LuckyAndreas.CodingTestMongoDB.Collections.ShippingMethods;

public interface ShippingMethodRepository extends MongoRepository<ShippingMethods, Long> {
}
