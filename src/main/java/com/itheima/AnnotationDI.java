package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDI {
    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeService employeeService = ac.getBean(EmployeeService.class);
        employeeService.save();
    }
}
