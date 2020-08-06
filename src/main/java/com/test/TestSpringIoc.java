package com.test;

import com.test.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIoc {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext beans=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) beans.getBean("user");
        User user2 = (User) beans.getBean("user");
        System.out.println(user==user2);
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext beans=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) beans.getBean("user2");
        System.out.println(user.getId());
    }
    @Test
    public void test3(){
        ClassPathXmlApplicationContext beans=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) beans.getBean("user3");
        System.out.println(user.getId());
    }
}
