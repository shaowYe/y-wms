package com.ysw.ywms.controller;

import com.ysw.ywms.entity.ResponseResult;
import com.ysw.ywms.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ysw.ywms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Object login(String uname,String pwd) {
        User user=userService.findUserByUname(uname);
        if (user==null){
            log.info(uname+"未查询到用户！");
            return ResponseResult.error("用户名或密码不存在");
        }

        return "";
    }
}
