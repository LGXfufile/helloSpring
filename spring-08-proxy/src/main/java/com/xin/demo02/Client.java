package com.xin.demo02;

public class Client {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler01 pih = new ProxyInvocationHandler01();

        //通过调用程序处理角色来处理我们要调用的接口对象；
        pih.setUserService(userService);//生成代理类要实现这个接口，但是此时代理类还没被创建出来；

        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
