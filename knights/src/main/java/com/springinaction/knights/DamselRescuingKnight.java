package com.springinaction.knights;

/**
 * @author	Lian
 * @time	2015年12月15日 上午1:48:52
 * @desc	'少女拯救'骑士: 负责拯救少女
 */
public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		/*
		 * DamselRescuingKnight在它的构造函数中自行创建了一个RescueDamselQuest
		 * DamselRescuingKnight与RescueDamselQuest紧耦合
		 * 极大的限制了这个骑士执行探险的能力. 表明该骑士只能救援少女
		 */
		quest = new RescueDamselQuest();
	}

	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}
