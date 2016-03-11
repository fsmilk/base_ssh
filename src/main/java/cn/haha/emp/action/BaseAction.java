package cn.haha.emp.action;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import cn.haha.emp.service.BaseService;

public abstract class BaseAction<T> implements ModelDriven<T> {
	
	public abstract BaseService<T> getBaseService();
	
	private Class modelDriverClass;
	
	private T t;
	
	//������ת����
	public static final String LISTACTION = "listAction";
	public static final String UPDATEUI ="updateUI";
	public static final String ADDUI = "addUI";
	public static final String ACTION2ACTION = "action2action";
	
	

	public BaseAction() {
		//�õ�BaseAction<T>
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		//�õ�T��class
		this.modelDriverClass = (Class) type.getActualTypeArguments()[0];
		
		try {
			this.t = (T) this.modelDriverClass.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public T getModel(){
		return this.t;
	}
	
	//��ѯ
	public String showData(){
		List<T> dataList = this.getBaseService().queryEntry();
		ActionContext.getContext().put("dataList", dataList);
		return "list";
	}
	//���
	public String addUI(){
		return "addUI";
	}
	public String add() throws Exception{
		Object obj = this.modelDriverClass.newInstance();
		BeanUtils.copyProperties(this.getModel(), obj);
		T t = (T) obj;
		this.getBaseService().saveEntry(t);
		return "action2action";
	}
	
	//�޸�
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	
	public String UpdateUI(){
		T t = this.getBaseService().getEntryById(this.id);
		ActionContext.getContext().getValueStack().push(t);
		return "updateUI";
	}
	
	
	
	
	
	
	

}
