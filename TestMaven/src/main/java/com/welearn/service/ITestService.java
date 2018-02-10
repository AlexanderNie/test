package com.welearn.service;

import java.util.List;

import com.welearn.domain.Employees;

public interface ITestService {
	public Employees getEmployeeById(int employeeId);  
	public List<Employees> getEmpsByNameLike(String name);  
}
