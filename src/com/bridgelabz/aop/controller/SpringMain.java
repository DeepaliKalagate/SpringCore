package com.bridgelabz.aop.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.aop.services.EmployeeService;

public class SpringMain 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("EmployeeService", EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Deepali");

//		employeeService.getEmployee().throwException();

		ctx.close();
	}
}

