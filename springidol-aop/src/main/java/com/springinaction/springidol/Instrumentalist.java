package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月20日 下午10:49:04
 * @desc	定义表演者--乐器演奏家
 */
public class Instrumentalist implements Performer {
	private Instrument instrument;

	@Override
	public void perform() throws PerformanceException {
		instrument.paly();
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
