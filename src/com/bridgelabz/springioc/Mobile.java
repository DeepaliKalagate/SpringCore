package com.bridgelabz.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mobile
{
	public static void main(String[] args) 
	{
		//Using APPLICATIONCONTEXT Container
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Sim sim=context.getBean("sim",Sim.class);
		System.out.println("\n*********Using APPLICATIONCONTEXT Container*********");
		sim.calling();
		sim.data();
		System.out.println("\n\n*********Using BEANFACTORY CONTAINER*******");
		
		//Using BEANFACTORY Container
		ClassPathResource path=new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(path);
		Sim sim1=factory.getBean("sim", Sim.class);
		sim1.calling();
		sim1.data();
	}
}
