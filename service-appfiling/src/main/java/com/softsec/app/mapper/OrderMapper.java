package com.softsec.app.mapper;

import com.softsec.app.pojo.OrderInfo;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select * from orderinfo where id = #{id}")
    OrderInfo findById(int id);
}
