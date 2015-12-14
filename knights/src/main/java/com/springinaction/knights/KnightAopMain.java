package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author	Lian
 * @time	2015年12月15日 上午2:44:43
 * @desc	Spring AOP的应用
 */
public class KnightAopMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("knights-aop.xml");

		Knight knight = (Knight) context.getBean("knight");

		knight.embarkOnQuest();
	}
}
