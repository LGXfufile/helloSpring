package com.xin.demo01;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        proxy proxy = new proxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
