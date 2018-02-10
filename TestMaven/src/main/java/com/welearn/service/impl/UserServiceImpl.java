package com.welearn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.welearn.dao.EmployeesMapper;
import com.welearn.domain.Employees;
import com.welearn.service.ITestService;

@Service("userService")  
public class UserServiceImpl implements ITestService {  
    @Resource  
    private EmployeesMapper employeeDao;  
    public Employees getEmployeeById(int employeeId) {  
        // TODO Auto-generated method stub  
        return this.employeeDao.selectByPrimaryKey(employeeId);  
    }
	public List<Employees> getEmpsByNameLike(String name) {
		// TODO Auto-generated method stub
		return this.employeeDao.getEmpsByNameLike(name);
	}

  
}  
