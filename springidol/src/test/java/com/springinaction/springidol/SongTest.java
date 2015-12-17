package com.springinaction.springidol;

import static java.lang.System.setProperty;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author	Lian
 * @time	2015年12月17日 上午12:37:56
 * @desc	SpEL表达式的使用
 */
public class SongTest {
	
	@BeforeClass
	public static void init() {
		setProperty("STANS_SONG", "Total Eclipse of the Heart");
	}
	@Test
	public void performaceTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		Instrumentalist stan = (Instrumentalist) context.getBean("stan");
		try {
			stan.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
