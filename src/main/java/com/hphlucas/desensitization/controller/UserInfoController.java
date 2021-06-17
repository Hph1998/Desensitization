package com.hphlucas.desensitization.controller;

import com.hphlucas.desensitization.entity.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @GetMapping
    public UserInfo getUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Lucas");
        userInfo.setIdNum("123456789123456789");
        userInfo.setPhone("13066666666");
        userInfo.setAddress("深圳市南山区深圳湾一号6601");
        userInfo.setPassword("abc123qwe");
        return userInfo;
    }

}
