package com.ypy.sorm.core;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.ypy.sorm.bean.ColumnInfo;
import com.ypy.sorm.bean.TableInfo;
import com.ypy.sorm.po.Sys_account;
import com.ypy.sorm.utils.JDBCUtils;
import com.ypy.sorm.utils.RefectUtils;

/**
 * 负责针对mysql数据库的查询
 * @author DELL
 *
 */
public class MySqlQuery implements Query {

	@Override
	public int executeDML(String sql, Object[] params) {
		Connection conn = DBManager.getConnection();
		int count = 0;
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			
			//给sql设参
			JDBCUtils.handleParams(ps, params);
			System.out.println(ps);
			count = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(ps, conn);
		}
		
		return count;
	}

	@Override
	public void insert(Object obj) {
		//obj-->表中 insert into 表名 (id,uname,pwd) values (?,?,?);
		Class c = obj.getClass();
		List<Object> params = new ArrayList<Object>(); //存储sql的参数对象
		TableInfo tableInfo = TableContext.poClassTableMap.get(c);
		StringBuffer sql = new StringBuffer("insert into " + tableInfo.getTname() + " (");
		int countNotNullField = 0; //计算不为null的属性值
		Field[] fs = c.getDeclaredFields();
		for(Field f:fs){
			String fieldName = f.getName();
			Object fieldValue = RefectUtils.invokeGet(fieldName, obj);
			
			if(fieldValue!=null){
				countNotNullField++;
				sql.append(fieldName + ",");
				params.add(fieldValue);
			}
		}
		
		sql.setCharAt(sql.length()-1, ')');
		sql.append(" values (");
		for(int i=0;i<countNotNullField;i++){
			sql.append("?,");
		}
		sql.setCharAt(sql.length()-1, ')');
		
		executeDML(sql.toString(), params.toArray());
	}

	@Override
	public void delete(Class clazz, Object id) {
		
		//Sys_account.class --> delete from sys_account where id = ?
		
		//通过class对象找TableInfo
		TableInfo tableInfo = TableContext.poClassTableMap.get(clazz);
		ColumnInfo onlyPriKey = tableInfo.getOnlyPriKey();
		
		String sql = "delete from " + tableInfo.getTname() 
			+ " where " + onlyPriKey.getName() + "=?";
		executeDML(sql, new Object[]{id});
	}

	@Override
	public void delete(Object obj) {
		Class c = obj.getClass();
		TableInfo tableInfo = TableContext.poClassTableMap.get(c);
		ColumnInfo onlyPriKey = tableInfo.getOnlyPriKey();
		
		Object priKeyValue = RefectUtils.invokeGet(onlyPriKey.getName(), obj);
		
		delete(c, priKeyValue);
	}

	@Override
	public int update(Object obj, String[] fieldNames) {
		//obj{"uname","pwd"} --> update 表明 set uname=?,pwd=? where id=?
		Class c = obj.getClass();
		List<Object> params = new ArrayList<Object>(); //存储sql的参数对象
		TableInfo tableInfo = TableContext.poClassTableMap.get(c);
		ColumnInfo priKey = tableInfo.getOnlyPriKey();
		StringBuffer sql = new StringBuffer("update " + tableInfo.getTname() + " set ");
		
		for(String fname:fieldNames){
			Object fvalue = RefectUtils.invokeGet(fname, obj);
			params.add(fvalue);
			sql.append(fname + "=?,");
		}
		sql.setCharAt(sql.length()-1, ' ');
		sql.append(" where ");
		sql.append(priKey.getName() + "=? ");
		
		params.add(RefectUtils.invokeGet(priKey.getName(), obj));
		
		return executeDML(sql.toString(), params.toArray());
	}

	@Override
	public List queryRows(String sql, Class clazz, Object[] params) {
		
		Connection conn = DBManager.getConnection();
		List list = null; //存放查询结果的容器
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement(sql);
			
			//给sql设参
			JDBCUtils.handleParams(ps, params);
			System.out.println(ps);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			//多行
			while(rs.next()){
				if(list==null){
					list = new ArrayList<>();
				}
				Object rowObj = clazz.newInstance(); //调用javabean的无参构造
				
				//多列
				for(int i=0; i<metaData.getColumnCount(); i++){
					String columnName = metaData.getColumnName(i+1);
					Object columnValue = rs.getObject(i+1);
					
					//调用rowObj对象的setUsername方法，将columnValue的值设置进去
					if(columnValue != null){
						RefectUtils.invokeSet(rowObj, columnName, columnValue);
					}
				}
				
				list.add(rowObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(ps, conn);
		}
		return list;
	}

	@Override
	public Object queryUniqueRows(String sql, Class clazz, Object[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object queryValue(String sql, Object[] obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Number queryNumber(String sql, Object[] obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		//测试
//		testInsert();
//		testUpdate();
//		testdelete();
		testQueryRows();
	}
	
	public static void testInsert(){
		System.out.println("新增");
		Sys_account sa = new Sys_account();
		sa.setAcct_id("123456");
		sa.setAcct_nm("123456");
		new MySqlQuery().insert(sa);
	}
	
	public static void testUpdate(){
		System.out.println("更新");
		Sys_account sa = new Sys_account();
		sa.setAcct_id("123456");
		sa.setAcct_nm("123456");
		new MySqlQuery().update(sa, new String[]{"acct_nm"});
	}

	public static void testdelete(){
		System.out.println("删除");
		Sys_account sa = new Sys_account();
		sa.setAcct_id("123456");
		sa.setAcct_nm("123456");
		new MySqlQuery().delete(sa);
	}
	
	public static void testQueryRows(){
		System.out.println("查询多行多列");
		List<Sys_account> list = new MySqlQuery().queryRows("select * from sys_account", 
				Sys_account.class, new Object[]{});
		for(Sys_account s:list){
			System.out.println(s.getAcct_id());
		}
	}

}
