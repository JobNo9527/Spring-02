package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // 加载配置文件的两种方式
        // 1.加载类路径下的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从文件系统下加载配置文件
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\DevelopmentZone\\Java\\SpringProjects\\Spring-02\\src\\main\\resources\\applicationContext.xml");

        //第三方数据源处理demo
        /*DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);*/

        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();

/*
        //获取bean的三种方式
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
        BookDao bookDao = applicationContext.getBean(BookDao.class);
*/

        /*
        // 演示获取bean的第三种方式会出现的问题
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        BookDao bookDao2 = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao2);
        */

    }
}
