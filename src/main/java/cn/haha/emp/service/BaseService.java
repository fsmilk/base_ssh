package cn.haha.emp.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	public void saveEntry(T t);
	public void deleteEntry(Serializable id);
	public void updateEntry(T t);
	public List<T> queryEntry();
	public T getEntryById(Serializable id);
}
