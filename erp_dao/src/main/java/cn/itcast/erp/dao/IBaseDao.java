package cn.itcast.erp.dao;

import java.util.List;

public interface IBaseDao<T> {
	
	/**
	 * 条件查询
	 * @param t1
	 * @param t2
	 * @param param
	 * @return
	 */
	public List<T> getList(T t1, T t2, Object param);
	
	/**
	 * 分页
	 * @param t1
	 * @param t2
	 * @param param
	 * @param firstResult
	 * @param maxResults
	 * @return
	 */
	public List<T> listByPage(T t1, T t2, Object param, int firstResult, int maxResults );
	
	/**
	 * 分页统计
	 * @param t1
	 * @param t2
	 * @param param
	 * @return
	 */
	public Long getCount(T t1, T t2, Object param);
	
	/**
	 * 新增
	 * @param t
	 * @return
	 */
	public void add(T t);
	
	/**
	 * 删除
	 * @param uuid
	 */
	public void delete(Long uuid);

	/**
	 * 通过编辑查询对象
	 * @param id
	 */
	public T get(long uuid);
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	public T get(String id);
	
	/**
	 * 修改
	 * @param t
	 */
	public void update(T t);

}
