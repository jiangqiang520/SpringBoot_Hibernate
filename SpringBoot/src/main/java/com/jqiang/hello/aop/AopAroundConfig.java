package com.jqiang.hello.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.jqiang.hello.constant.LogPrinter;

@Aspect
@Component
public class AopAroundConfig {

	@Pointcut("execution(* com.jqiang.hello.api.*.*(..))")
	public void pointcunt() {
	}

	@Around("pointcunt()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		LogPrinter.printRequestLog();
		Object[] objs = pjp.getArgs();
		for (Object o : objs) {
			System.out.println("request params:" + o );
		}
		Object res = pjp.proceed();
		System.out.println("return :"+res);
        LogPrinter.printResponseLog();
	}
}
