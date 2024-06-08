package com.tka.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	@Around(value = "execution(* com.tka.service..*.*())")
	public Object printHello(ProceedingJoinPoint pjp) throws Throwable {
		System.err.println("hello...1111");
		Object oj = pjp.proceed();
		System.err.println("hello...2222");
		return oj;
	}
}
