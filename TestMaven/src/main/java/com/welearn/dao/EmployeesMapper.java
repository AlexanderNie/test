package com.welearn.dao;

import java.util.List;

import com.welearn.domain.Employees;

public interface EmployeesMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer empId);
    
    List<Employees> getEmpsByNameLike(String name);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}