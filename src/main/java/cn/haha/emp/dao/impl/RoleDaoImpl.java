package cn.haha.emp.dao.impl;

import org.springframework.stereotype.Repository;

import cn.haha.emp.dao.RoleDao;
import cn.haha.emp.domain.Role;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{

}
