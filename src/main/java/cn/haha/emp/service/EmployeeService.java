package cn.haha.emp.service;

import java.util.List;

import cn.haha.emp.dao.EmployeeDao;
import cn.haha.emp.domain.Employee;

public class EmployeeService {
	
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> getAll(){
		return employeeDao.getAll();
	}
	
}
