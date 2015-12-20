package com.springinaction.springidol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Lian
 * @time 2015年12月20日 下午10:43:56
 * @desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("sneaky-magician.xml")
public class AopMagicianTest {
	@Autowired
	MindReader magician;

	@Autowired
	Thinker volunteer;

	@Test
	public void magicianShouldReadVolunteersMind() {
		volunteer.thinkOfSomething("Queen of Hearts");

		assertEquals("Queen of Hearts", magician.getThoughts());
	}
}
