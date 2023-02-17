package com.itheima.dao.impl;

import com.itheima.dao.OrderDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
@Scope("singleton")
public class OrderDaoImpl implements OrderDao {

    @Override
    public void save() {
        System.out.println("order dao save...");
    }

    /*
        @PostConstruct和 @PreDestroy注解位于 java.xml.ws.annotation包是Java EE的模块的一部分。J2EE已经在Java 9中被弃用，并且计划在Java 11中删除它。
        因此需要导入maven坐标
    */
//    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }
}
