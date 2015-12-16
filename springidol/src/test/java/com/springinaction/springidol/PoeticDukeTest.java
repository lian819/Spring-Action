package com.springinaction.springidol;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author	Lian
 * @time	2015年12月17日 上午12:37:56
 * @desc	边表演杂技边朗诵莎士比亚诗歌
 */
public class PoeticDukeTest {
	@Test
	public void performaceText() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		PoeticJuggler performer = (PoeticJuggler) context.getBean("poeticDuke");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
