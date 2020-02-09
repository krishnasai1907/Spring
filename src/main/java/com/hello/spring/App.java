package com.hello.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    
	
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {

    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    	Vehical obj=(Vehical)context.getBean("car");
    	obj.drive();
    	Tyre tr=(Tyre)context.getBean("any");
    	System.out.println(tr);
    	
    }
}
