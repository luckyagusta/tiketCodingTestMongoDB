package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Employees;

public interface EmployeeService {
	public void uploadEmployee(List<Employees> employees);
	public Employees findEmployee(Long employeeID);
}
