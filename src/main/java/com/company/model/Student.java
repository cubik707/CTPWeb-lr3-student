package com.company.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class Student {

    private long id;
    private String fname;
    private String lname;
    private String address;
    private String mobileNo;
    private String mailId;
    private String city;
    private String designation;
    private Date dob;
    private Date doj;
    private BigDecimal salary;
    private Timestamp addDate;

    public Student() {
    }

    public Student(String fname, String lname, String address, String mobileNo, String mailId, String city, String designation, Date dob, Date doj, BigDecimal salary) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.mobileNo = mobileNo;
        this.mailId = mailId;
        this.city = city;
        this.designation = designation;
        this.dob = dob;
        this.doj = doj;
        this.salary = salary;
    }

    public Student(long id, String fname, String lname, String address, String mobileNo, String mailId, String city, String designation, Date dob, Date doj, BigDecimal salary) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.mobileNo = mobileNo;
        this.mailId = mailId;
        this.city = city;
        this.designation = designation;
        this.dob = dob;
        this.doj = doj;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", mobileNo=" + mobileNo + ", mailId=" + mailId + ", city=" + city + ", designation=" + designation + ", dob=" + dob + ", doj=" + doj + ", salary=" + salary + ", addDate=" + addDate + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

