package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月20日 下午10:48:19
 * @desc	定义乐器--吉他
 */
public class Guitar implements Instrument {

	@Override
	public void paly() {
		System.out.println("Strum strum strum");
	}

}
