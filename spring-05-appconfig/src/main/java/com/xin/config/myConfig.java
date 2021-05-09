package com.xin.config;

import com.xin.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//The preceding AppConfig class is equivalent to the following Spring <beans/> XML:
@Configuration//类似beans
public class myConfig {

    /**
     * 注册一个bean相当于之前写的bean标签；
     * 方法名字，相当于bean标签中的id属性；
     * 方法返回值，相当于bean标签中的class类名；
     */
    @Bean
    public User getUser(){
        return new User();
    }

}
