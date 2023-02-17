package com.itheima.service.impl;

import com.itheima.dao.EmployeeDao;
import com.itheima.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public void save() {
        System.out.println("employee service save...");
        employeeDao.save();
    }
}
