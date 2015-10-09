package com.springinaction.springidol;

/**
 * @author Lian
 * @time 2015年10月10日 上午1:14:20
 * @desc 一个很有天赋的音乐演奏家
 */
public class Instrumentalist implements Performer {
	public Instrumentalist() {
	}

	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	private String song;

	// 注入歌曲
	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

	private Instrument instrument;

	// 注入乐器
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
