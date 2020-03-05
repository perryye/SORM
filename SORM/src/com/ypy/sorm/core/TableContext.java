package com.ypy.sorm.core;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ypy.sorm.bean.ColumnInfo;
import com.ypy.sorm.bean.TableInfo;
import com.ypy.sorm.utils.JavaFileUtils;
import com.ypy.sorm.utils.StringUtils;

/**
 * 负责获取管理数据库所有表结构和类结构的关系，并且可以根据表结构获取类结构
 * @author DELL
 *
 */
public class TableContext {
	
	/**
	 * 表名为key，表信息为value
	 */
	public static Map<String, TableInfo> tables = new HashMap<String, TableInfo>();
	
	/**
	 * 将po的class对象和表信息对象关联起来，便于重用
	 */
	public static Map<Class, TableInfo> poClassTableMap = new HashMap<Class, TableInfo>();
	
	public TableContext() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		try {
			//初始化获得表的信息
			Connection conn = DBManager.getConnection();
			DatabaseMetaData dbmd = conn.getMetaData();
			/*
			 * getTables这个方法带有四个参数，他们表示的含义如下：
			 * String catalog——要获得表所在的编目。串“”””意味着没有任何编目，Null表示所有编目。
			 * String schema——要获得表所在的模式。串“”””意味着没有任何模式，Null表示所有模式。该参数可以包含单字符的通配符（“_”）,也可以包含多字符的通配符（“%”）。
			 * String tableName——指出要返回表名与该参数匹配的那些表，该参数可以包含单字符的通配符（“_”）,也可以包含多字符的通配符（“%”）。
			 * String types——一个指出返回何种表的数组。可能的数组项是：”TABLE”，”VIEW”，”SYSTEM TABLE”，”GLOBAL TEMPORARY”，”LOCAL TEMPORARY”，”ALIAS”，“SYSNONYM”。
			 */
			ResultSet tableRet = dbmd.getTables(null, "%", "%", new String[]{"TABLE"});
			
			while(tableRet.next()){
				String tableName = (String) tableRet.getObject("TABLE_NAME");
				TableInfo ti = new TableInfo(tableName, new HashMap<String, ColumnInfo>(), 
						new ArrayList<ColumnInfo>());
				tables.put(tableName, ti);
				
				ResultSet set = dbmd.getColumns(null, "%", tableName, "%"); //查询表中所有字段
				while(set.next()){
					ColumnInfo ci = new ColumnInfo(set.getString("COLUMN_NAME"), 
							set.getString("TYPE_NAME"), 0);
					String string = set.getString("COLUMN_NAME");
					ti.getColumns().put(set.getString("COLUMN_NAME"), ci);
				}
				
				ResultSet set2 = dbmd.getPrimaryKeys(null, "%", tableName); //查询t_user表中的主键
				while(set2.next()){
					ColumnInfo ci2 = ti.getColumns().get(set2.getObject("COLUMN_NAME"));
					ci2.setKeyType(1); //设置为主键类型
					ti.getPriKeys().add(ci2);
				}
				
				if(ti.getPriKeys().size() > 0){ //取唯一主键，方便使用
					ti.setOnlyPriKey(ti.getPriKeys().get(0));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//更新类结构
		updateJavaPOFile();
		
		//加载po包下所有的类，便于重用，提高效率
		loadPOTables();
		
	}
	
	public static Map<String, TableInfo> getTableInfos() {
		return tables;
	}
	
	/**
	 * 根据表结构，更新配置的po包下的java类
	 * 实现了从表结构到类结构
	 */
	public static void updateJavaPOFile(){
		Map<String, TableInfo> map = TableContext.tables;
		for (TableInfo t:map.values()) {
			JavaFileUtils.createJavaPOFile(t, new MySqlTypeConvertor());
		}
	}
	
	/**
	 * 加载po包下的类
	 */
	public static void loadPOTables(){
		for(TableInfo tableInfo:tables.values()){
			try {
				Class c = Class.forName(DBManager.getConf().getPoPakege() + "." 
						+ StringUtils.firstChar2UperCase(tableInfo.getTname()));
				poClassTableMap.put(c, tableInfo);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Map<String, TableInfo> tables = TableContext.getTableInfos();
		System.out.println(tables);
	}

}
