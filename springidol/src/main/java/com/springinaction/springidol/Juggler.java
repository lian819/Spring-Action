package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月17日 上午12:34:21
 * @desc	一个杂技师参赛者
 */
public class Juggler implements Performer {

	/** 杂技师可以同时抛起的豆袋子数量 */
	private int beanBags = 3;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}
}
