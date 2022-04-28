package com.ritik.foodordering.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "orders_details")
public class OrderedDetails {
	
	@Column(name = "order_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	
	@ManyToOne
	@JoinColumn(name = "user", referencedColumnName = "id")
	private AppUser userId;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "pincode")
	private int pincode;
	  

	
	// empty body constructor
	



	public OrderedDetails() {
		super();
	}


	//all field constructor

	public OrderedDetails(AppUser userId, String city, String street, String landmark, int pincode) {
		super();
		this.userId = userId;
		this.city = city;
		this.street = street;
		this.landmark = landmark;
		this.pincode = pincode;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public AppUser getUserId() {
		return userId;
	}



	public void setUserId(AppUser userId) {
		this.userId = userId;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getLandmark() {
		return landmark;
	}



	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
}
