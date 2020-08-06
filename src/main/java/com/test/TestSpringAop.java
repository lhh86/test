package com.test;

import com.test.aop.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {
    @Test
    public void test(){
        ClassPathXmlApplicationContext beans=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) beans.getBean("userController");
        userController.test();
    }
}
