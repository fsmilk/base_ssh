package cn.haha.emp.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.haha.emp.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements RequestAware{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	private Map<String,Object> request;
	
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}
	
	public String list(){
		request.put("employees", employeeService.getAll());
		return "list";
				
	}

}
