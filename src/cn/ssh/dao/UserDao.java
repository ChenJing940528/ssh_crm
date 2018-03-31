package cn.ssh.dao;

import cn.ssh.domain.User;

public interface UserDao extends BaseDao<User>{

    //根据登录名称查询user对象
    User getByUserCode(String usercode);

}
