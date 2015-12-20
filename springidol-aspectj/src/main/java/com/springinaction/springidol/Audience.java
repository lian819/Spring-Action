package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月20日 下午5:55:16
 * @desc	观众类
 */
public class Audience {
	/**
	 * 就坐方法
	 */
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}

	/**
	 * 关手机方法
	 */
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}

	/**
	 * 鼓掌方法
	 */
	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	/**
	 * 喝倒彩方法
	 */
	public void demandRefund() {
		System.out.println("We want out money back!");
	}
}
