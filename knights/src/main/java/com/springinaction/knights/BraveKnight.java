package com.springinaction.knights;

/**
 * @author	Lian
 * @time	2015年12月15日 上午1:54:02
 * @desc	这个骑士不仅勇敢, 而且能挑战任何形式的探险
 * 			要点是BraveKnight没有与任何特定的Quest实现发生耦合. 松耦合
 * 			如果一个对象只通过接口(而不是具体实现或初始化的过程)来表明依赖关系, 那么这种依赖
 * 		就能够在对象本身毫不知情的情况下, 用不同的具体实现进行替换
 */
public class BraveKnight implements Knight {
	private Quest quest;
	private Minstrel minstrel;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public BraveKnight(Quest quest, Minstrel minstrel) {
		// Quest 被注入进来。构造器注入
		this.quest = quest;
		this.minstrel = minstrel;
	}

	@Override
	public void embarkOnQuest() throws QuestException {
		// minstrel.singBeforeQuest();
		quest.embark();
		// minstrel.singAfterQuest();
	}
}
