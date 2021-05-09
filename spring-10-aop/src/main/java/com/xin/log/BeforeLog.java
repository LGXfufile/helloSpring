package com.xin.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    /**
     *
     * @param method 要执行的目标对象的方法
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");

    }
}