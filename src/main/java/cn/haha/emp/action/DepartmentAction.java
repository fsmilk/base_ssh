package cn.haha.emp.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.haha.emp.domain.Department;
import cn.haha.emp.service.BaseService;
import cn.haha.emp.service.DepartmentService;

@Controller("departmentAction")
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department>{
	
	@Resource(name="departmentService")
	private DepartmentService departmentService;

	@Override
	public BaseService<Department> getBaseService() {
		// TODO Auto-generated method stub
		return this.departmentService;
	}
	
	
	//��ѯ��������
	public String showAllDepartment(){
		List<Department> departmentList = this.departmentService.queryEntry();
		ActionContext.getContext().put("departmentList", departmentList);
		return LISTACTION;
	}
	//����
	public String updateUI(){
		Department d = this.departmentService.getEntryById(this.getModel().getDid());
		ActionContext.getContext().getValueStack().push(d);
		return UPDATEUI;
	}
	
	public String update(){
		Department d = this.departmentService.getEntryById(this.getModel().getDid());
		BeanUtils.copyProperties(this.getModel(),d);
		this.departmentService.updateEntry(d);
		return ACTION2ACTION;
	}
	//�½�
	public String addUI(){
		return ADDUI;
	}
	
	public String add(){
		Department d = new Department();
		BeanUtils.copyProperties(this.getModel(),d);
		this.departmentService.saveEntry(d);
		return ACTION2ACTION;
	}
	//ɾ��
	public String delete(){
		this.departmentService.deleteEntry(this.getModel().getDid());
		return ACTION2ACTION;
	}
	
	

}
