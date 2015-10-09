package com.springinaction.knights;

public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		// DamselRescuingKnight与RescueDamselQuest紧耦合
		quest = new RescueDamselQuest();
	}

	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}
