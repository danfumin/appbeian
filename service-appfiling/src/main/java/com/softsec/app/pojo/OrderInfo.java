package com.softsec.app.pojo;

import com.softsec.feign.pojo.User;
import lombok.Data;

@Data
public class OrderInfo {
    private int id;
    private Long price;
    private String name;
    private Integer num;
    private int userId;
    private User user;
}