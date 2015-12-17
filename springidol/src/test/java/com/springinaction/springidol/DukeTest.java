package com.springinaction.springidol;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author	Lian
 * @time	2015年12月17日 上午12:37:56
 * @desc	对duke进行测试排练
 */
public class DukeTest {
	@Test
	public void performaceTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		Juggler performer = (Juggler) context.getBean("duke");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
