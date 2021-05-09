package com.xin.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，来自动生成代理类；
public class ProxyInvocationHandler01 implements InvocationHandler {

    //被代理的接口；
    private UserService userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    /**
     *  Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
     *                                           new Class<?>[] { Foo.class },
     *                                           handler);
     */

    //得到代理类，和官方保持一致；
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),this);
    }

    /**
     * 官方解释：Processes a method invocation on a proxy instance and returns the result.
     * 翻译：处理代理实例，并返回结果；
     * 但是真正生成代理类的是: proxy
     * 官方已给出了解释：
     * Proxy provides static methods for creating dynamic proxy classes and instances；
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //动态代理的本质就是使用反射来实现；
        Object result = method.invoke(userService, args);
        return result;
    }
}
