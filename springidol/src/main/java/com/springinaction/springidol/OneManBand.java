package com.springinaction.springidol;

import java.util.Collection;

/**
 * @author Lian
 * @time 2015年10月10日 上午1:41:27
 * @desc 一个乐队的参赛者
 */
public class OneManBand implements Performer {
	public OneManBand() {
	}

	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	private Collection<Instrument> instruments;

	// 注入instruments集合
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
}
