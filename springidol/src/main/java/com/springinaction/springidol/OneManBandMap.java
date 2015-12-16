package com.springinaction.springidol;

import java.util.Map;

/**
 * @author Lian
 * @time 2015年10月10日 上午1:41:27
 * @desc 一个乐队的参赛者:可以同时演奏多种乐器
 * 		参数类型为Map
 */
public class OneManBandMap implements Performer {
	public OneManBandMap() {
	}

	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.println(key + ":");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}

	}

	private Map<String, Instrument> instruments;

	// 注入instruments集合
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
}
