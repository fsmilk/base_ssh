package cn.haha.emp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.haha.emp.dao.BaseDao;
import cn.haha.emp.dao.DepartmentDao;
import cn.haha.emp.domain.Department;
import cn.haha.emp.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{
	
	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;
	
	@Override
	public BaseDao<Department> getBaseDao() {
		// TODO Auto-generated method stub
		return this.departmentDao;
	}

}
