package com.softsec.user.web;

import com.softsec.user.config.PatternProperties;
import com.softsec.user.pojo.User;
import com.softsec.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/user")
@RefreshScope  //方式一实现配置文件热更新：加入注解属性刷新
public class UserController {

    @Autowired
    private UserService userService;

//     @Value("${pattern.dateformat}")
//     private String dateformat;

    @Autowired
    private PatternProperties properties;

    @GetMapping("prop")
    public PatternProperties properties(){
        System.out.println("prop");
        return properties;
    }

    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateformat()));
//        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") int id,
                          @RequestHeader(value = "Truth", required = false) String truth) {
        System.out.println("truth: " + truth);
        return userService.queryById(id);
    }
}
