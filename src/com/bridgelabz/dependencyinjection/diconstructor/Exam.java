package com.bridgelabz.dependencyinjection.diconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beanConstructor.xml");
		Student student=context.getBean("Student1", Student.class);
		student.displayInfo();
		
		Student student1=context.getBean("Student2", Student.class);
		student1.displayInfo();
	}
}
