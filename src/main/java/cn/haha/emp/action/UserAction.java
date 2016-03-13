package cn.haha.emp.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.haha.emp.domain.Department;
import cn.haha.emp.domain.Role;
import cn.haha.emp.domain.User;
import cn.haha.emp.service.BaseService;
import cn.haha.emp.service.DepartmentService;
import cn.haha.emp.service.RoleService;
import cn.haha.emp.service.UserService;

@Controller("userAction")
public class UserAction extends BaseAction<User>{
	
	@Resource(name="userService")
	private UserService userService;
	
	@Resource(name="departmentService")
	private DepartmentService departmentService;
	
	@Resource(name="roleService")
	private RoleService roleService;
	
	@Override
	public BaseService<User> getBaseService() {
		// TODO Auto-generated method stub
		return this.userService;
	}
	
	//查找所有用户
	public String showAllUser(){
		//List<User> userList = this.userService.queryEntry();
		List<User> userList = this.userService.getAllUser();
		ActionContext.getContext().put("userList", userList);
		return LISTACTION;
	}
	
	//添加用户
	public String addUI(){
		List<Department> dList = this.departmentService.queryEntry();
		List<Role> rList = this.roleService.queryEntry();
		ActionContext.getContext().getValueStack().push(dList);
		ActionContext.getContext().getValueStack().push(rList);
		return ADDUI;
	}
	

}
