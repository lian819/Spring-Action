package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月17日 上午1:05:47
 * @desc	舞台:一个典型的单例类
 */
public class Stage {
	private Stage() {
	}

	// 延迟加载实例
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}

	// 返时实例
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
