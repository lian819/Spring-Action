package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		// 加载上下文
		ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

		// 获取Knight Bean
		Knight knight = (Knight) context.getBean("knight");

		// 使用knight
		knight.embarkOnQuest();
	}
}
