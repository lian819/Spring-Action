package com.springinaction.springidol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author	Lian
 * @time	2015年12月18日 上午1:06:22
 * @desc	测试--Spring自动检测并注册Bean
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("spring-idol.xml")
public class AnnotationConfigTest {
	@Autowired
	@Qualifier("eddie")
	private Instrumentalist eddie;

	@Autowired
	private Instrument guitar;

	
	@Test
	public void shouldWiredWithAutowire() {
		try {
			eddie.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(eddie.getInstrument());
		assertNotNull(eddie.getInstrument());
		assertEquals(guitar, eddie.getInstrument());
	}
}
