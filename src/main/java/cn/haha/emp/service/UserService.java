package cn.haha.emp.service;

import java.util.List;

import cn.haha.emp.domain.User;

public interface UserService extends BaseService<User>{
	//�ڶ��ַ���
	
	public List<User> getAllUser();
}
