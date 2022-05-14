package com.java;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(length=30)
	private String State;
	@Column(length=30)
	private String Country;
	@Column(length=6)
	private int Pincode;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [State=" + State + ", Country=" + Country + ", Pincode=" + Pincode + "]";
	}
	public Address(String state, String country, int pincode) {
		super();
		State = state;
		Country = country;
		Pincode = pincode;
	}

	public Address()
	{
		super();
	}
}
