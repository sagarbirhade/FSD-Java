package com.entity;

import java.sql.Blob;

public class Employee {
	private int emp_id;
	private String emp_name;
	private Blob image;
	public Employee(int emp_id, String emp_name2, Blob image) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name2;
		this.image = image;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", image=" + image + "]";
	}
	
	

}
