package com.springinaction.springidol;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author	Lian
 * @time	2015年12月17日 上午12:37:56
 * @desc	多乐器演奏, 参数类型为Map
 */
public class HanksTest {
	@Test
	public void performaceText() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		OneManBandMap performer = (OneManBandMap) context.getBean("hanks");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
