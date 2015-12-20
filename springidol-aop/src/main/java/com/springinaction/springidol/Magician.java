package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月20日 下午11:09:16
 * @desc	定义魔法师
 */
public class Magician implements MindReader {
	private String thoughts;

	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercept volunteer's thoughts");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
