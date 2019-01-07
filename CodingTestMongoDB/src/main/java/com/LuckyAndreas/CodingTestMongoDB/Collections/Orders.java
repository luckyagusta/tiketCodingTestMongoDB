package com.LuckyAndreas.CodingTestMongoDB.Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Orders")
public class Orders {
	
	@Id
	private Long _id;
	private Customers customer;
	private Employees employee;
	private String PurchaseOrderNumber;
	private ShippingMethods shippingMethods;
	private Double FreightCharge;
	private Double Taxes;
	private String Comment;
	private Date OrderDate;
	private Date ShipDate;
	private char PaymentReceived;
	
	
	public Long get_id() {
		return _id;
	}
	public void set_id(Long _id) {
		this._id = _id;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	public String getPurchaseOrderNumber() {
		return PurchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		PurchaseOrderNumber = purchaseOrderNumber;
	}
	public ShippingMethods getShippingMethods() {
		return shippingMethods;
	}
	public void setShippingMethods(ShippingMethods shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	public Double getFreightCharge() {
		return FreightCharge;
	}
	public void setFreightCharge(Double freightCharge) {
		FreightCharge = freightCharge;
	}
	public Double getTaxes() {
		return Taxes;
	}
	public void setTaxes(Double taxes) {
		Taxes = taxes;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) throws ParseException {
		Date dateFormat= new SimpleDateFormat("dd/MM/yyyy").parse(orderDate);  
		OrderDate = dateFormat;
	}
	public Date getShipDate() {
		return ShipDate;
	}
	public void setShipDate(String shipDate) throws ParseException {
		Date dateFormat = new SimpleDateFormat("dd/MM/yyyy").parse(shipDate); 
		ShipDate = dateFormat;
	}
	public char getPaymentReceived() {
		return PaymentReceived;
	}
	public void setPaymentReceived(char paymentReceived) {
		PaymentReceived = paymentReceived;
	}
	
	
	
	
}
