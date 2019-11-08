package com.bridgelabz.beanscopes.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("singletonscopebean.xml");
		Employee e1=context.getBean("employee", Employee.class);
		e1.setId(01);
		e1.setName("Deepali Lokesh Patil");
		System.out.println(e1);
	}

}
