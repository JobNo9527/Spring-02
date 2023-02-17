package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationLifeCycle {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderDao orderDao = ac.getBean(OrderDao.class);
        OrderDao orderDao2 = ac.getBean(OrderDao.class);
        System.out.println(orderDao);
        System.out.println(orderDao2);
        ac.close();
    }
}
