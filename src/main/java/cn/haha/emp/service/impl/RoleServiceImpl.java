package cn.haha.emp.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.haha.emp.dao.BaseDao;
import cn.haha.emp.dao.RoleDao;
import cn.haha.emp.domain.Role;
import cn.haha.emp.service.RoleService;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService{

	@Resource(name="roleDao")
	private RoleDao roleDao;
	public BaseDao<Role> getBaseDao() {
		// TODO Auto-generated method stub
		return this.roleDao;
	}

}
