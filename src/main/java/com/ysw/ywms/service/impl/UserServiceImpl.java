package com.ysw.ywms.service.impl;

import com.ysw.ywms.pojo.User;
import com.ysw.ywms.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserByUname(String uname) {
        //先用假的数据
        User u =new User();
        u.setUid(new Long(123456));
        u.setUname("张三");
        u.setCreateDate(new Date());
        u.setNickName("张三");
        u.setPwd("password");
        u.setSalt("salt");
        u.setModifyDate(new Date());
        return u;
    }
}
