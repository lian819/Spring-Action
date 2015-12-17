package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author	Lian
 * @time	2015年12月18日 上午1:04:17
 * @desc	参赛者--乐器演奏者
 */
@Component("eddie")
public class Instrumentalist implements Performer {

	@Autowired
	private Instrument instrument;

	public Instrument getInstrument() {
		return instrument;
	}

	@Override
	public void perform() throws PerformanceException {
		instrument.play();
	}

}
