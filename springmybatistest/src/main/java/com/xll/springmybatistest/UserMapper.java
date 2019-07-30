package com.xll.springmybatistest;



import org.springframework.stereotype.Component;

import java.util.List;


public interface UserMapper {

    public List<User> getUser() throws Exception;

    public void deleteUser(int id) throws Exception;

    public void addUser(User user) throws Exception;
}
