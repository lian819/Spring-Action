package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Lian
 * @time 2015年12月20日 下午10:58:51
 * @desc 观察每个表演者的演出时长
 */
public class AroundAudience {
	public void watchPerformace(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones");
			long start = System.currentTimeMillis(); // <co
														// id="co_beforeProceed"/>

			joinpoint.proceed(); // <co id="co_proceed"/>

			long end = System.currentTimeMillis(); // <co id="co_afterProceed"/>
			System.out.println("CLAP CLAP CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start) + " milliseconds.");
		} catch (Throwable t) {
			System.out.println("Boo! We want our money back!"); // <co
																// id="co_afterException"/>
		}
	}
}
