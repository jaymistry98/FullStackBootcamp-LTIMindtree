package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AppAdvice {
	
	@Before("execution(* com.mainservice.JoinOrganization.joinOrg(..))")
	public void callBefore() {
		System.out.println("calling before app");
	}
	
	@After("execution(* com.mainservice.JoinOrganization.joinOrg(..))")
	public void callAfter() {
		System.out.println("calling after app");
	}
	
	//@Around("execution(* com.mainservice.JoinOrganization.joinOrg(..))")
	public void callAround(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("called before");
		pj.proceed();
		System.out.println("called after");
	}

	

}
