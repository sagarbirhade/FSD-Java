package com.Hibernate_Maven_3rd_Method.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emptable")

public class Employee {
	
	@Id
	@Column(name = "empid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	
	@Column(name = "fname", nullable = false)
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "salary") // there is no need to give name by default it will be variable name
	private double salary;
	
	@Column(name = "contact", unique = true)
	private long contact;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String fname, String lname, double salary, long contact) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary
				+ ", contact=" + contact + "]";
	}
	
	
	

}
