package cn.haha.emp.test;

import org.junit.Test;

import cn.haha.emp.action.DepartmentAction;
import cn.haha.emp.domain.Department;
import cn.haha.emp.service.DepartmentService;

public class DepartmentTest extends SpringUtils {
	
	@Test
	public void testSaveDepartment(){
		DepartmentService ds = (DepartmentService) context.getBean("departmentService");
		Department d = new Department();
		d.setName("公关部");
		d.setDescription("很好");
		ds.saveEntry(d);
	}
	
	@Test
	public void testDepartmentAction(){
		DepartmentAction departmentAction = (DepartmentAction) context.getBean("departmentAction");
		System.out.println(departmentAction);
	}
}
