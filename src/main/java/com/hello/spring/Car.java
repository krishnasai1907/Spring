package com.hello.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical{
	

	public void drive() {
		System.out.println("Hi its Car Coming");
		
	}

}
