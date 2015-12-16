package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月17日 上午12:51:44
 * @desc	一个会朗诵诗歌的杂技师
 */
public class PoeticJuggler extends Juggler {
	private Poem poem;

	// 注入poem
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	// 注入豆袋子数量和Poem
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
