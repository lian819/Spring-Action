package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Duke {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol-copy.xml");

		Performer duke = (Performer) context.getBean("duke");

		duke.perform();
	}

}
