package com.xll.springmybatistest;

import java.util.List;

public interface UserService {
    public List<User> getUser() throws Exception;

    public void deleteUser(int id) throws Exception;

    public void addUser(User user) throws Exception;
}
