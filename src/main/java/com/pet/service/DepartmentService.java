package com.pet.service;

import com.pet.entity.Departments;

import java.util.List;

public interface DepartmentService {
    /*
    * 科室的增删改查
    * */
    List<Departments> departmentList(Departments departments);
    int deleteDepartment(Integer departmentId);
    int addDepartment(Departments departments);
    int count(Departments departments);

    /*
     * 判断该科室是否还有医生
     * */
    int checkCount(Integer departmentId);
}
