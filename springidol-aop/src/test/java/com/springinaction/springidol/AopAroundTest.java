package com.springinaction.springidol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author	Lian
 * @time	2015年12月20日 下午10:43:56
 * @desc	
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("spring-idol-around.xml")
public class AopAroundTest {
	@Autowired
	ApplicationContext context;

	@Test
	public void audiencePointcutTest() throws PerformanceException {
		Performer eddie = (Performer)context.getBean("eddie");
		eddie.perform();
	}
}
