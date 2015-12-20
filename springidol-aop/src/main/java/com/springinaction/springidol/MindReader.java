package com.springinaction.springidol;

/**
 * @author	Lian
 * @time	2015年12月20日 下午11:08:06
 * @desc	定义读心者
 */
public interface MindReader {
	void interceptThoughts(String thoughts);
	String getThoughts();
}
