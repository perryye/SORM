package com.ypy.sorm.core;

import java.util.List;

/**
 * 负责对外提供服务的核心类
 * @author DELL
 *
 */
@SuppressWarnings("all")
public interface Query {
	/**
	 * 直接执行一个DML语句
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeDML(String sql, Object[] params);
	
	/**
	 * 将一个对象存储到数据库中
	 * @param obj
	 */
	public void insert(Object obj);
	
	/**
	 * 删除clazz表示类对应的表中的记录（指定主键值id的记录）
	 * @param clazz 跟表对应的类的class对象
	 * @param id 主键的值
	 * @return
	 */
	public void delete(Class clazz, Object id);
	/**
	 * 删除对象在数据库中对应的记录（对象所在的类对应到表，对象的主键的值对应到记录）
	 * @param obj
	 */
	public void delete(Object obj);
	
	/**
	 * 更新对象对应的记录，并且只更新指定字段的值
	 * @param obj
	 * @param fieldNames
	 * @return
	 */
	public int update(Object obj, String[] fieldNames);
	
	/**
	 * 查询返回多行记录，并将每行记录封装到clazz指定的类的对象中
	 * @param sql 查询语句
	 * @param clazz 封装数据的javabean类的class对象
	 * @param params sql的参数
	 * @return 查询到的结果
	 */
	public List	queryRows(String sql, Class clazz, Object[] params);
	
	/**
	 * 查询返回一行记录，并将该记录封装到clazz指定的类的对象中
	 * @param sql 查询语句
	 * @param clazz 封装数据的javabean类的class对象
	 * @param params sql的参数
	 * @return 查询到的结果
	 */
	public Object queryUniqueRows(String sql, Class clazz, Object[] params);
	
	/**
	 * 查询返回一个值（一行一列）
	 * @param sql 查询语句
	 * @param obj sql的参数
	 * @return 查询到的结果
	 */
	public Object queryValue(String sql, Object[] obj);
	
	/**
	 * 查询返回一个数字（一行一列）
	 * @param sql 查询语句
	 * @param obj sql的参数
	 * @return 查询到的结果
	 */
	public Number queryNumber(String sql, Object[] obj);
	
}
