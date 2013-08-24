package com.springaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public MyMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaction/springidol/spring.xml");
		//Performer performer = (Performer) context.getBean("poeticDuke");
		Performer performer = (Performer) context.getBean("kenny");
	    performer.perform();

	}

}
