package com.xin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component等价于<bean id="user" class="com.xin.pojo.User"/>
@Component
public class User {
    public String name;

    @Value("xinxin2")
    public void setName(String name) {
        this.name = name;
    }
}
