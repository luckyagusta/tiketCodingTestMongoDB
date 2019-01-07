package com.LuckyAndreas.CodingTestMongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;
import com.LuckyAndreas.CodingTestMongoDB.ServiceKafka.ProduceService;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	@Autowired
	private ProduceService kafkaProduce ;
	
	@GetMapping("customers")
	public List<Customers> getAllCustomer(){
		return kafkaProduce.getListCustomer();
	}
	
	@GetMapping("employeeByorder")
	public List<Object> getEmployeeByOrder(){
		return kafkaProduce.getEmployeeByOrder();
	}
	
	@GetMapping("shippingMethodByOrder")
	public List<Object> getSmInUsed(){
		return kafkaProduce.getShippingMethodInUsed();
	}
	
	@RequestMapping(value = "getProductDetail/{orderId}", method = RequestMethod.GET)
	public List<Object> getProductByOrder(@PathVariable("orderId") long orderID){
		return kafkaProduce.getProductByOrder(orderID);
	}
	
	@RequestMapping(value = "getDetailPayment/{orderId}", method = RequestMethod.GET)
	public List<Object> getDetailPayment(@PathVariable("orderId") long orderID){
		
		return kafkaProduce.getDetailPayment(orderID);
	}
	
}
