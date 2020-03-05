package com.ypy.sorm.utils;

/**
 * 封装了字符串常用的操作
 * @author DELL
 *
 */
public class StringUtils {
	
	/**
	 * 将目标字符串首字母变成大写
	 * @param 目标字符串
	 * @return 首字母大写的字符串
	 */
	public static String firstChar2UperCase(String str){
		return str.toUpperCase().substring(0, 1) + str.substring(1);
	}

}
