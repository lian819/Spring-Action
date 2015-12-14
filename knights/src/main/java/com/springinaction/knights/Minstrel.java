package com.springinaction.knights;

/**
 * @author	Lian
 * @time	2015年12月15日 上午2:18:06
 * @desc	伟大的骑士身后总有吟游诗人Minstrel为其赞颂
 */
public class Minstrel {
	// 探险之前调用
	public void singBeforeQuest() {
		System.out.println("Fa la la; The knight is so brave!");
	}

	// 探险之后调用
	public void singAfterQuest() {
		System.out.println("Tee hee he; The brave knight did embark on a quest!");
	}
}
