package com.bridgelabz.beanscopes.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("prototypescopebean.xml");
		Employee1 e1=context.getBean("employee", Employee1.class);
		e1.setId(01);
		e1.setName("Lokesh Patil");
		System.out.println(e1);
		
		Employee1 e2=context.getBean("employee", Employee1.class);
		e2.setId(02);
		e2.setName("Deepali Patil");
		System.out.println(e2);
	}
}
