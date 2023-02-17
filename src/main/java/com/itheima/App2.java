package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        System.out.println(userDao);

        //这种方式是没有给bean一个唯一标识,所以才需要传入这样的形参
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
    }
}
