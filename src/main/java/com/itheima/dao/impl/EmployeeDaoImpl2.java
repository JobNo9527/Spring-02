package com.itheima.dao.impl;

import com.itheima.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

@Repository("employeeDao2")
public class EmployeeDaoImpl2 implements EmployeeDao {
    @Override
    public void save() {
        System.out.println("employee dao save...");
    }
}
