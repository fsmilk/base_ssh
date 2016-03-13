package cn.haha.emp.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.haha.emp.dao.UserDao;
import cn.haha.emp.domain.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	//第二种方法
	//hql : "from User u left outer join fetch u.department d left outer join fetch u.roles r"
	@Override
	public List<User> getAllUser() {
		StringBuffer sb = new StringBuffer();
		sb.append("from User u ");
		sb.append("left outer join fetch u.department d ");
		sb.append("left outer join fetch u.roles r");
		return (List<User>) this.hibernateTemplate.find(sb.toString());
	}

}
