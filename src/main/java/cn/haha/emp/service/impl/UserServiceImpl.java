package cn.haha.emp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.haha.emp.dao.BaseDao;
import cn.haha.emp.dao.UserDao;
import cn.haha.emp.domain.User;
import cn.haha.emp.service.UserService;
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public BaseDao<User> getBaseDao() {
		// TODO Auto-generated method stub
		return this.userDao;
	}

	@Override
	public List<User> getAllUser() {
		return this.userDao.getAllUser();
	}

}
