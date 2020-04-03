package com.nice.serviceImpl;

import com.nice.dao.UserDao;
import com.nice.service.UserService;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

//    public UserServiceImpl(UserDao userDao) {
//        super();
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        userDao.save();

    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
