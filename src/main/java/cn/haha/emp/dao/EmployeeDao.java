package cn.haha.emp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.haha.emp.domain.Employee;

public class EmployeeDao {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	} 
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	public List<Employee> getAll(){
		String hsql = "FROM Employee";
		return getSession().createQuery(hsql).list();
	}
}
