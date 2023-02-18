package com.itheima.dao.impl;

import com.itheima.dao.TeacherDao;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void save() {
        System.out.println("teacher dao save...");
    }
}
