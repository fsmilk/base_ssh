package cn.haha.emp.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import cn.haha.emp.dao.BaseDao;
import cn.haha.emp.service.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T>{
		//声明一个抽象方法，用于子类实现
		public abstract BaseDao<T> getBaseDao();
		
		@Transactional
		public void saveEntry(T t) {
			this.getBaseDao().saveEntry(t);
			
		}

		@Transactional
		public void deleteEntry(Serializable id) {
			this.getBaseDao().deleteEntry(id);
		}

		@Transactional
		public void updateEntry(T t) {
			this.getBaseDao().updateEntry(t);
		}
	

		@Transactional
		public List<T> queryEntry() {
			return this.getBaseDao().queryEntry();
		}

		@Transactional
		public T getEntryById(Serializable id) {
			return this.getBaseDao().getEntryById(id);
		}

	
}
