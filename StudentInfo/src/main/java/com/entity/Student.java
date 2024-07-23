package com.entity;

public class Student {
    private int roll_no;
    private String name;
    private double marks;
    private String department;
    private String contact;
    private String email;

    public Student(int roll_no, String name, double marks, String department, String contact, String email) {
        super();
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
        this.department = department;
        this.contact = contact;
        this.email = email;
    }

    public Student() {
        super();
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + ", department=" + department + ", contact=" + contact + ", email=" + email + "]";
    }
}
