package com.rainbow.user.service;

import com.rainbow.user.dao.RainbowUserDao;
import com.rainbow.user.model.RainbowUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 郑立轩
 * @since: 2019/11/19
 * create at : 2019/11/19 21:42
 */
@Service
public class UserService {
    @Autowired
    private RainbowUserDao userDao;

    public RainbowUser selectUser() {
        return userDao.selectUser();

    }
}
