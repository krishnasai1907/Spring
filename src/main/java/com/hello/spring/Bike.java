package com.hello.spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical{

	public void drive() {
		System.out.println("Hi its Bike coming");
		
	}

	
}
