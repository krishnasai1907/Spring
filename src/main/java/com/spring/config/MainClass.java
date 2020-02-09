package com.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	Redmi red=context.getBean(Redmi.class);
	red.myRedmi();
}
}
