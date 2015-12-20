package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月20日 下午11:11:36
 * @desc	定义志愿者
 */
public class Volunteer implements Thinker {
	private String thoughts;

	@Override
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}
}
