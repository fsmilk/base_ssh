package cn.haha.emp.dao;

import java.util.Collection;
import java.util.List;

import cn.haha.emp.domain.User;

public interface UserDao extends BaseDao<User>{

	//�ڶ��ַ���
	public List<User> getAllUser();
}
