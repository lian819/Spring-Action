package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestKenny {

	public static void main(String[] args) throws PerformanceException {
		kennyTest();
	}

	public static void kennyTest() throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol-copy.xml");

		Performer duke = (Performer) context.getBean("kenny");

		duke.perform();
	}

}
