package com.springinaction.springidol;

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
