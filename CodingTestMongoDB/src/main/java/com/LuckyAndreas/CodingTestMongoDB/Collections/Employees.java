package com.LuckyAndreas.CodingTestMongoDB.Collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employess")
public class Employees {
	
	@Id
	private Long _id;
	private String FirstName;
	private String LastName;
	private String Title;
	private String WorkPhone;
	
	
	public Long get_id() {
		return _id;
	}
	public void set_id(Long _id) {
		this._id = _id;
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
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getWorkPhone() {
		return WorkPhone;
	}
	public void setWorkPhone(String workPhone) {
		WorkPhone = workPhone;
	}
	
	
}
