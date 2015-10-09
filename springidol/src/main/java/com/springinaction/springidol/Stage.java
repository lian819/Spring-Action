package com.springinaction.springidol;

public class Stage {
	private Stage() {
	}

	// 延迟加载实例
	private static class StageSingletonHolder {
		static Stage instance = new Stage(); // <co id="co_lazyLoad"/>
	}

	// 返时实例
	public static Stage getInstance() {
		return StageSingletonHolder.instance; // <co id="co_returnInstance"/>
	}
}
