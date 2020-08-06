package com.test.aop;

import com.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userController")
public class UserController {
    @Autowired
    private UserService userService;
    public void test(){
        User user=new User();
        user.setId(12);
        user.setName("这个那是");
        userService.service(user,"李四");
    }
}
