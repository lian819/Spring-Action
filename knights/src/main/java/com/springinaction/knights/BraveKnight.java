package com.springinaction.knights;

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
