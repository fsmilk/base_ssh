package cn.haha.emp.test;

import java.util.List;

import org.junit.Test;

import cn.haha.emp.domain.User;
import cn.haha.emp.service.UserService;

public class UserTest extends SpringUtils{
	
	@Test
	public void testUserList(){
		UserService us = (UserService) context.getBean("userService");
		//List<User> list = us.queryEntry();
		List<User> list = us.getAllUser();
		for(User u:list){
			System.out.println(u);
		}
	}
}
