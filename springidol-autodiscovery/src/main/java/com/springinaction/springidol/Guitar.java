package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * @author	Lian
 * @time	2015年12月18日 上午12:59:07
 * @desc	乐器--吉他
 */
@Component
public class Guitar implements Instrument {
	@Override
	public void play() {
		System.out.println("Strum strum strum");
	}
}
