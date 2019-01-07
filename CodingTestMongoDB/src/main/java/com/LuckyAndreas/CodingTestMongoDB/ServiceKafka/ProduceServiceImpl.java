package com.LuckyAndreas.CodingTestMongoDB.ServiceKafka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Employees;
import com.LuckyAndreas.CodingTestMongoDB.Collections.OrderDetails;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Orders;
import com.LuckyAndreas.CodingTestMongoDB.Collections.Products;
import com.LuckyAndreas.CodingTestMongoDB.Collections.ShippingMethods;
import com.LuckyAndreas.CodingTestMongoDB.Repository.CustomerRepository;
import com.LuckyAndreas.CodingTestMongoDB.Repository.OrderDetailRepository;
import com.LuckyAndreas.CodingTestMongoDB.Repository.OrderRepository;

@Service
public class ProduceServiceImpl extends DetailPaymentService implements ProduceService {
	
	@Autowired
	private KafkaTemplate<String, Customers> customerkafkaTemplate;
	
	@Autowired
	private KafkaTemplate<String, List<Object>> objectkafkaTemplate;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private OrderDetailRepository odRepo;
	
	@Value("${message.topic.name}")
    private String kafkaTopic;
	
	@Override
	public List<Customers> getListCustomer(){
		List<Customers> listCustomer = customerRepo.findAll();
		for (Customers customers : listCustomer) {
			customerkafkaTemplate.send(kafkaTopic, customers);
		}
		return listCustomer;
	}

	@Override
	public List<Object> getShippingMethodInUsed()  {
		List<Object> listSm = new ArrayList<>();
		List<Orders> orders = orderRepo.findAll();
		for (Orders order : orders) {
			Map<String, Object> map = new HashMap<>();
			ShippingMethods sm = new ShippingMethods();
			sm = order.getShippingMethods();
			map.put("OrderID", order.get_id());
			map.put("ShippingMethodID", sm.get_id());
			map.put("ShippingMethod", sm.getShippingMethod());
			listSm.add(map);

		}
		objectkafkaTemplate.send(kafkaTopic, listSm);
		return listSm;
	
	}

	@Override
	public List<Object> getEmployeeByOrder() {
	List<Object> listEmp = new ArrayList<>();
		
		List<Orders> orders = orderRepo.findAll();
		for (Orders order : orders) {
			Map<String, Object> map = new HashMap<>();
			Employees emp = new Employees();
			emp = order.getEmployee();
			map.put("EmployeeID", emp.get_id());
			map.put("FirstName", emp.getFirstName());
			map.put("LastName", emp.getLastName());
			map.put("Title", emp.getTitle());
			map.put("WorkPhone", emp.getWorkPhone());
			map.put("OrderID", order.get_id());
			listEmp.add(map);	
		}
		objectkafkaTemplate.send(kafkaTopic, listEmp);
		return listEmp;
	}

	@Override
	public List<Object> getProductByOrder(Long orderID) {
		List<Object> listProd = new ArrayList<>();
		List<OrderDetails> orderDetail = odRepo.findAll();
		for (OrderDetails od : orderDetail) {
			if(od.getOrder().get_id() == orderID){
			Map<String, Object> map = new HashMap<>();
			Products prod = new Products();
			Orders order = new Orders();
			order = od.getOrder();
			prod = od.getProduct();
			map.put("OrderID", order.get_id());
			map.put("OrderDetailID", od.get_id());
			map.put("ProductName", prod.getProductName());
			map.put("Quantity", od.getQuantity());
			map.put("UnitPrice", "$"+od.getUnitPrice());
			map.put("Discount", "$"+od.getDiscount());
			Long disc = od.get_id();
			if(disc != 0){
				Double subTotal = od.getUnitPrice() * disc / 100;
			map.put("SubTotal", "$"+subTotal);
			}
			else{
				map.put("SubTotal", "$"+od.getUnitPrice());
			}
			listProd.add(map);
			}
			
		}
		objectkafkaTemplate.send(kafkaTopic, listProd);
		return listProd;
	}

	@Override
	public List<Object> getDetailPayment(Long orderID) {
		List<Object> obj = getDetailPaymentQuery(orderID);
		objectkafkaTemplate.send(kafkaTopic, obj);
		return obj;
	}
	
	
	
	
	
}
