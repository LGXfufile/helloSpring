package com.xin.mapper;

import com.xin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Mapper//表示是mybatis的mapper类,这是Dao层；
@ResponseBody//这里也可以用@Component,只是为了分层；
public interface UserMapper {

    List<User> queryUserList();
    User queryUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

}
