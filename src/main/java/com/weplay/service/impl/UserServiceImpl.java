package com.weplay.service.impl;

import com.weplay.Pojo.User;
import com.weplay.dao.UserDao;
import com.weplay.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Wenbo on 16/10/21.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(String userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }


}
