package com.jingyuan.huanan.dao;

import com.jingyuan.huanan.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

//    @Select("SELECT * FROM juba_users WHERE id = #{id}")
    User selectUser(int id);
}
