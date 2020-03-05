package com.ypy.sorm.core;

/**
 * 负责java类型和数据库类型互相转换
 * @author DELL
 *
 */
public interface TypeConvertor {
	/**
	 * 将数据库的庶数据类型转化成java的数据类型
	 * @param columnType 数据库字段的数据类型
	 * @return java数据类型
	 */
	public String databaseType2JavaType(String columnType);
	
	/**
	 * 将java数据类型转化成数据库数据类型
	 * @param javaDataType java数据类型
	 * @return 数据库数据类型
	 */
	public String javaType2DatabaseType(String javaDataType);

}
