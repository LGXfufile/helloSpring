package com.xin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/query")
    public List<Map<String, Object>> userList(){

        String sql = "select *from user_List";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;

    }

    @RequestMapping("/addUser")
    public String addUser(){
        String sql = "insert into user_List(id,userName,userAge) values (5,'明明',9)";
        jdbcTemplate.update(sql);
        return "addUser ok~";
    }

    @RequestMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
        String sql = "update user_List set userAge = 100 where id = "+id;
        jdbcTemplate.update(sql);
        return "updateUser ok~";
    }

    @RequestMapping("/updateUserBatchParas/{id}")
    public String updateUserBatchParas(@PathVariable("id") int id){
        String sql = "update user_List set userAge = ? ,userName = ? where id = "+id;
        Object[] objects = new Object[2];
        objects[0] = 22;
        objects[1] = "xinxin";
        jdbcTemplate.update(sql,objects);
        return "updateUserBatchParas ok~";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        String sql = "delete from user_List where id = ?";
        jdbcTemplate.update(sql,id);
        return "deleteUser ok~";
    }

}
