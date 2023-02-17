package com.itheima.dao.impl;

import com.itheima.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    @Value("itheima")
    private String name;

    @Override
    public void save() {
        System.out.println("employee dao save..." + name);
    }
}
