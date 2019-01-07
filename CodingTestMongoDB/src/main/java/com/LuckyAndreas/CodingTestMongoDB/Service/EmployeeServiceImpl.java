package com.LuckyAndreas.CodingTestMongoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Employees;
import com.LuckyAndreas.CodingTestMongoDB.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void uploadEmployee(List<Employees> employees) {
		for (Employees employee : employees) {
			employeeRepository.save(employee);
		}
		
	}

	@Override
	public Employees findEmployee(Long employeeID) {
		Employees emp = employeeRepository.findById(employeeID).get();
		return emp;
	}

}
