package cn.haha.emp.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public interface BaseDao<T> {
	public void saveEntry(T t);
	public void deleteEntry(Serializable id);
	public void updateEntry(T t);
	public List<T> queryEntry();
	public T getEntryById(Serializable id);
	//public Set<T> getEntrysByIds(Serializable[] ids);
}
