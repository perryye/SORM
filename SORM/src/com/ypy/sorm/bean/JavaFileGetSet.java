package com.ypy.sorm.bean;

/**
 * 封装了java属性和get、set方法
 * @author DELL
 *
 */
public class JavaFileGetSet {
	/*
	 * 属性的源码信息，如：private int userId;
	 */
	private String fieldInfo;
	/*
	 * get方法的源码信息，如：public int getUserId(){};
	 */
	private String getInfo;
	/*
	 * set方法的源码信息，如：public int setUserId(int id){this.id = id;};
	 */
	private String setInfo;
	
	public JavaFileGetSet() {
		// TODO Auto-generated constructor stub
	}
	
	public JavaFileGetSet(String fieldInfo, String getInfo, String setInfo) {
		super();
		this.fieldInfo = fieldInfo;
		this.getInfo = getInfo;
		this.setInfo = setInfo;
	}
	
	@Override
	public String toString() {
		// 打印信息，方便调试
		System.out.println(fieldInfo);
		System.out.println(getInfo);
		System.out.println(setInfo);
		return super.toString();
	}

	public String getFieldInfo() {
		return fieldInfo;
	}
	public void setFieldInfo(String fieldInfo) {
		this.fieldInfo = fieldInfo;
	}
	public String getGetInfo() {
		return getInfo;
	}
	public void setGetInfo(String getInfo) {
		this.getInfo = getInfo;
	}
	public String getSetInfo() {
		return setInfo;
	}
	public void setSetInfo(String setInfo) {
		this.setInfo = setInfo;
	}
	

}
