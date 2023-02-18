package com.itheima;

import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class AnnotationThirdBeanManager {

    public static void main(String[] args) {

        //这样第三方的bean就被加载进容器中
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource bean = ac.getBean(DataSource.class);
        System.out.println(bean);
    }
}
