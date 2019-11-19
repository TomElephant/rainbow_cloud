package com.rainbow.user.dao;

import com.rainbow.user.model.RainbowUser;
import org.apache.ibatis.annotations.Select;

/**
 * @author: 郑立轩
 * @since: 2019/11/19
 * create at : 2019/11/19 21:42
 */
public interface RainbowUserDao {
    @Select("select * from rainbow_user where id = 1")
    RainbowUser selectUser();

}
