package com.bridgelabz.dependencyinjection.diconstructor;

public class Student
{
	private int studentId;
	private String studentName;
	
	public Student(int studentId)
	{
		this.studentId=studentId;
	}
	public Student(String studentName)
	{
		this.studentName=studentName;
	}
	public Student(int studentId,String studentName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
	}
	public void displayInfo()
	{
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Name : "+studentName);
	}
}
