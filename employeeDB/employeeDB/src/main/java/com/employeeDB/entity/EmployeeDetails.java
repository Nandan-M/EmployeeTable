package com.employeeDB.entity;

import java.sql.Date;

import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDetails {

	private Long Employee_Id;
	public Long getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(Long employee_Id) {
		Employee_Id = employee_Id;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<Integer> getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(List<Integer> phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	private String FirstName;
	private String LastName;
	private String Email;
	private List<Integer> PhoneNumber;
	private Date DOJ;
	private int Salary;
	

	
	}	
