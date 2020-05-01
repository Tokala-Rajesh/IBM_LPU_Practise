package com.example.demo.model;



public class Employee 
{
	private int empId;
	
	private String empName;
	
	private String email;
	
	private String departmentName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee( String empName, String email, String departmentName) {
		super();
	
		this.empName = empName;
		this.email = email;
		this.departmentName = departmentName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [empId=" + empId + ", empName=" + empName + ", email=" + email + ", departmentName="
				+ departmentName + "]";
	}
	
	

}
