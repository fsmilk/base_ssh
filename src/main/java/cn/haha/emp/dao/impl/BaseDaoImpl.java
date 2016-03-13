package cn.haha.emp.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;

import cn.haha.emp.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{
	
	@Resource(name="hibernateTemplate")
	protected HibernateTemplate hibernateTemplate;
	
	
	//实体bean的class形式
	private Class entityClass;
	public BaseDaoImpl(){
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.entityClass = (Class)type.getActualTypeArguments()[0];
	}
	
	@Override
	public void saveEntry(T t) {
		this.hibernateTemplate.save(t);
	}

	@Override
	public void deleteEntry(Serializable id) {
		T t = (T) this.hibernateTemplate.get(this.entityClass, id);
		this.hibernateTemplate.delete(t);
	}

	@Override
	public void updateEntry(T t) {
		this.hibernateTemplate.update(t);
	}

	@Override
	public List<T> queryEntry() {
		return (List<T>) this.hibernateTemplate.find("from "+this.entityClass.getName());
	}

	@Override
	public T getEntryById(Serializable id) {
		return (T) this.hibernateTemplate.get(this.entityClass, id);
	}

	@Override
	public List<T> queryList(String hql) {
		return (List<T>) this.hibernateTemplate.find(hql);
	}


}
