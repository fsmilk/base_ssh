package cn.haha.emp.dao.impl;



import org.springframework.stereotype.Repository;

import cn.haha.emp.dao.DepartmentDao;
import cn.haha.emp.domain.Department;


@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}
