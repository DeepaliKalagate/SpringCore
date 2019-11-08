package com.bridgelabz.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beanbytype.xml");
		Employee employee=context.getBean("emp", Employee.class);
		System.out.println(employee);
	}
}
