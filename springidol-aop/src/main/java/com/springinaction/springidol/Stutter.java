package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author	Lian
 * @time	2015年12月20日 下午11:15:54
 * @desc	
 */
public class Stutter {
	public Object stutter(ProceedingJoinPoint call) throws Throwable {
		call.proceed();
		call.proceed();
		call.proceed();
		call.proceed();
		call.proceed();
		call.proceed();
		call.proceed();
		call.proceed();
		return call.proceed();
	}
}
