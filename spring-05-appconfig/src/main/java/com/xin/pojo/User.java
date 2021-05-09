package com.xin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//这里注解，意思是这个类被spring接管了，注册到了容器中；
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("xinxin")//属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
