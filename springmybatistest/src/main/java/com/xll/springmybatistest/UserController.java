package com.xll.springmybatistest;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired UserService userService;

    @Autowired User user;
    //查看所有用户
    @RequestMapping("list")
    public List<User> index() throws Exception{
        return userService.getUser();
    }
    //删除用户
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id) throws Exception {
        userService.deleteUser(id);
        return "你已经删掉了id为"+id+"的用户";
    }

    //增加用户
    @RequestMapping("addUser")
    public String addUser() throws Exception {
        user.setLoginName("user1");
        user.setUsername("阿花");
        userService.addUser(user);
        return "增加用户";
    }




}
