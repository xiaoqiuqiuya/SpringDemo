package com.nice.impl;

import com.nice.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("this is my first spring demo");
    }
}
