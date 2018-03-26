package cn.ssh.service;

import cn.ssh.domain.User;

public interface UserService {
    //登录方法
    User getUserByCodePassword(User u);
    //注册用户
    void saveUser(User u);

}
