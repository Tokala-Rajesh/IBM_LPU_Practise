package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="roll_no")
	private int rollNo;
	@Column(name="student_name")
	private String studentName;
	@Column(name="student_class")
	private String studentClass;
	@Column(name="school")
	private String school;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String studentClass, String school) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.school = school;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", school=" + school + "]";
	}
	
	
	
	

}
