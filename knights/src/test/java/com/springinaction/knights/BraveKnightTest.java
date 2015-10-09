package com.springinaction.knights;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnuest() throws QuestException {
		// 创建mock的Quest
		Quest mockQuest = mock(Quest.class);
		Minstrel minstrel = mock(Minstrel.class);

		// 注入mock的Quest
		BraveKnight knight = new BraveKnight(mockQuest, minstrel);
		knight.embarkOnQuest();

		verify(mockQuest, times(1)).embark();

	}
}
