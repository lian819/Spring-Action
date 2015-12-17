package com.springinaction.springidol;


/**
 * @author	Lian
 * @time	2015年12月18日 上午1:01:05
 * @desc	乐器--钢琴
 */
public class Piano implements Instrument {
	public Piano() {

	}

	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}
}
