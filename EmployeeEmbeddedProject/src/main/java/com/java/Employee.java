package com.java;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emphibernate")
public class Employee {
	@Id
	
	private int emid;
	@Column(length=30)
	private String ename;
	
	@Embedded // to merge the Address class into the employee class
	Address address;

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", ename=" + ename + ", address=" + address + "]";
	}

	public Employee(int emid, String ename, Address address) {
		super();
		this.emid = emid;
		this.ename = ename;
		this.address = address;
	}
	
	public Employee()
	{
		super();
	}
	

}
