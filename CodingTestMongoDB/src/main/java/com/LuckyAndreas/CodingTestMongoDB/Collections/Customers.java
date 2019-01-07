package com.LuckyAndreas.CodingTestMongoDB.Collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customers")
public class Customers {

	@Id
	private Long _id;
	private String CompanyName;
	private String FirstName;
	private String LastName;
	private String BillingAddress;
	private String City;
	private String StateOrProvince;
	private String ZIPCode;
	private String Email;
	private String CompanyWebSite;
	private String PhoneNumber;
	private String FaxNumber;
	private String ShipAddress;
	private String ShipCity;
	private String ShipStateOrProvince;
	private String ShipZIPCode;
	private String ShipPhoneNumber;
	
	public Customers(){}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBillingAddress() {
		return BillingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		BillingAddress = billingAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStateOrProvince() {
		return StateOrProvince;
	}
	public void setStateOrProvince(String stateOrProvince) {
		StateOrProvince = stateOrProvince;
	}
	public String getZIPCode() {
		return ZIPCode;
	}
	public void setZIPCode(String zIPCode) {
		ZIPCode = zIPCode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCompanyWebSite() {
		return CompanyWebSite;
	}
	public void setCompanyWebSite(String companyWebSite) {
		CompanyWebSite = companyWebSite;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getFaxNumber() {
		return FaxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		FaxNumber = faxNumber;
	}
	public String getShipAddress() {
		return ShipAddress;
	}
	public void setShipAddress(String shipAddress) {
		ShipAddress = shipAddress;
	}
	public String getShipCity() {
		return ShipCity;
	}
	public void setShipCity(String shipCity) {
		ShipCity = shipCity;
	}
	public String getShipStateOrProvince() {
		return ShipStateOrProvince;
	}
	public void setShipStateOrProvince(String shipStateOrProvince) {
		ShipStateOrProvince = shipStateOrProvince;
	}
	public String getShipZIPCode() {
		return ShipZIPCode;
	}
	public void setShipZIPCode(String shipZIPCode) {
		ShipZIPCode = shipZIPCode;
	}
	public String getShipPhoneNumber() {
		return ShipPhoneNumber;
	}
	public void setShipPhoneNumber(String shipPhoneNumber) {
		ShipPhoneNumber = shipPhoneNumber;
	}
	
	
}
