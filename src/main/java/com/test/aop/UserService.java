package com.test.aop;

import com.test.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void service(User user,String name){
        System.out.println("我是service方法");
    }
}
