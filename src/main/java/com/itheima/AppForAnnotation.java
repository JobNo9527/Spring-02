package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {

    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = (UserDao) ac.getBean("userDao");
        System.out.println(userDao);
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
    }
}
