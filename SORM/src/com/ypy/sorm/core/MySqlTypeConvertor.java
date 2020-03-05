package com.ypy.sorm.core;

/**
 * mysql数据类型和java数据类型转换
 * @author DELL
 *
 */
public class MySqlTypeConvertor implements TypeConvertor {

	@Override
	public String databaseType2JavaType(String columnType) {
		if("VARCHAR".equalsIgnoreCase(columnType)
				||"CHAR".equalsIgnoreCase(columnType)
				||"TEXT".equalsIgnoreCase(columnType)){
			return "String";
		}else if("BLOB".equalsIgnoreCase(columnType)){
			return "byte[]";
		}else if("INTEGER".equalsIgnoreCase(columnType)){
			return "Long";
		}else if("INT".equalsIgnoreCase(columnType)
				||"TINYINT".equalsIgnoreCase(columnType)
				||"SMALLINT".equalsIgnoreCase(columnType)
				||"MEDIUMINT".equalsIgnoreCase(columnType)
				||"BOOLEAN".equalsIgnoreCase(columnType)){
			return "Integer";
		}else if("BIT".equalsIgnoreCase(columnType)){
			return "Boolean";
		}else if("BIGINT".equalsIgnoreCase(columnType)){
			return "java.math.BigInteger";
		}else if("FLOAT".equalsIgnoreCase(columnType)){
			return "Float";
		}else if("DOUBLE".equalsIgnoreCase(columnType)){
			return "Double";
		}else if("DECIMAL".equalsIgnoreCase(columnType)){
			return "java.math.BigDecimal";
		}else if("DATE".equalsIgnoreCase(columnType)){
			return "java.sql.Date";
		}else if("TIME".equalsIgnoreCase(columnType)){
			return "java.sql.Time";
		}else if("DATETIME".equalsIgnoreCase(columnType)
				||"TIMESTAMP".equalsIgnoreCase(columnType)){
			return "java.sql.Timestamp";
		}else if("YEAR".equalsIgnoreCase(columnType)){
			return "java.sql.Date";
		}
		//省略部分类型
		return null;
	}

	@Override
	public String javaType2DatabaseType(String javaDataType) {
		// TODO Auto-generated method stub
		return null;
	}

}
