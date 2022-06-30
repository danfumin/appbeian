package com.softsec.user.mapper;

import com.softsec.user.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    
    @Select("select * from t_user where id = #{id}")
    User findById(@Param("id") int id);
}