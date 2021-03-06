package com.xin.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationPointcut {

    @Before("execution(* com.xin.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("---执行前---");
    }
    @After("execution(* com.xin.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("---执行后---");

    }
    @Around("execution(* com.xin.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println(proceed);
        System.out.println("环绕后");
    }
}
