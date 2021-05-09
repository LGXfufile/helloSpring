package com.xin.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * InvocationHandler is the interface implemented by the invocation handler of a proxy instance.
 * Each proxy instance has an associated invocation handler.
 * When a method is invoked on a proxy instance,
 * the method invocation is encoded and dispatched to the invoke method of its invocation handler.
 */

//我们会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    /**
     * Proxy provides static methods for creating dynamic proxy classes and instances,
     * and it is also the superclass of all dynamic proxy classes created by those methods.
     *  Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
     *                                           new Class<?>[] { Foo.class },
     *                                           handler);
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), this::invoke);
    }

    @Override //处理代理实例，并返回结果；
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        UserServiceImpl result = (UserServiceImpl) method.invoke(userService, args);
        return result;
    }
}
