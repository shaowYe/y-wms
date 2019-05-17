package com.ysw.ywms.controller;

import com.ysw.ywms.entity.ResponseResult;
import com.ysw.ywms.pojo.User;
import com.ysw.ywms.util.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ysw.ywms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Object login(String uname, String pwd, HttpServletRequest request) {
        HttpSession httpSession=request.getSession();
        User user=userService.findUserByUname(uname);
        if (user==null){
            log.info(uname+"未查询到用户!");
            return ResponseResult.error("用户名或密码不存在!");
        }
        String ciphertext = MD5Utils.getSaltMd5AndSha(pwd);
        if(!user.getPwd().equals(ciphertext)){
            log.info(uname+"登陆密码错误");
            return ResponseResult.error("密码错误");
        }
        httpSession.setAttribute("user",user);
        return ResponseResult.success("登陆成功!");
    }
}
