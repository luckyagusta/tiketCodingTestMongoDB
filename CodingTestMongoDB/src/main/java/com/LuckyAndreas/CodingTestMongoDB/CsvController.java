package com.LuckyAndreas.CodingTestMongoDB;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Employees;
import com.LuckyAndreas.CodingTestMongoDB.Collections.OrderDetails;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Orders;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Products;
import com.LuckyAndreas.CodingTestMongoDB.Collections.ShippingMethods;
import com.LuckyAndreas.CodingTestMongoDB.Service.CsvDataLoader;
import com.LuckyAndreas.CodingTestMongoDB.Service.CustomerService;
import com.LuckyAndreas.CodingTestMongoDB.Service.EmployeeService;
import com.LuckyAndreas.CodingTestMongoDB.Service.OrderDetailService;
import com.LuckyAndreas.CodingTestMongoDB.Service.OrderService;
import com.LuckyAndreas.CodingTestMongoDB.Service.ProductService;
import com.LuckyAndreas.CodingTestMongoDB.Service.ShippingMethodService;
import com.LuckyAndreas.CodingTestMongoDB.Util.CsvPath;

@RestController
public class CsvController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private ProductService prodService;
	
	@Autowired
	private ShippingMethodService smService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderDetailService orderDetailService;
	
	@Autowired
	private CsvDataLoader loader;
	
	@GetMapping("/uploadCustomerCSV")
	public void uploadCustomerCSV() {
		List<Customers> customers = loader.readCsvCustomerMethods(CsvPath.CUSTOMERS);
		customerService.uploadCustomer(customers);
	}
	
	@GetMapping("/uploadEmployeeCSV")
	public void uploadEmployeeCSV() {
		List<Employees> employees = loader.readCsvEmployees(CsvPath.EMPLOYEES);
		employeeService.uploadEmployee(employees);
	}
	
	@GetMapping("/uploadProductCSV")
	public void uploadProductCSV() {
		List<Products> products = loader.readCsvProducts(CsvPath.PRODUCTS);
		prodService.uploadProduct(products);
	}
	
	@GetMapping("/uploadShippingMethodCSV")
	public void uploadShippingMethodCSV() {
		List<ShippingMethods> sm = loader.readCsvShippingMethods(CsvPath.ShippingMethods);
		smService.uploadShippingMethod(sm);
	}
	
	@GetMapping("/uploadOrderCSV")
	public void uploadOrderCSV() throws ParseException {
		List<Orders> order = loader.readCsvOrder(CsvPath.ORDERS);
		orderService.uploadOrder(order);
	}
	
	@GetMapping("/uploadOrderDetailCSV")
	public void uploadOrderDetailCSV() throws ParseException {
		List<OrderDetails> order = loader.readCsvOrderDetail(CsvPath.ORDERDETAILS);
		orderDetailService.uploadOrderDetail(order);
	}
}
