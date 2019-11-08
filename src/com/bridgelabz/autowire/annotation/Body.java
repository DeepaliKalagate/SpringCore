package com.bridgelabz.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beanannotation.xml");
		HumanAnno human=context.getBean("humananno", HumanAnno.class);
		human.startPumping();
	}
}
