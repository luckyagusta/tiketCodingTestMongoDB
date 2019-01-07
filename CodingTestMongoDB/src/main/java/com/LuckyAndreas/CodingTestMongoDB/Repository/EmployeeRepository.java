package com.LuckyAndreas.CodingTestMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Employees;

public interface EmployeeRepository extends MongoRepository<Employees, Long> {
}
