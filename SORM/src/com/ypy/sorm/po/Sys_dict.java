package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_dict {

	private String dict_id;
	private String dict_key;
	private String enable_flag;
	private String tab_name;
	private String col_name;
	private String dict_val;
	private Integer order_val;


	public String getDict_id(){
		return dict_id;
	}

	public String getDict_key(){
		return dict_key;
	}

	public String getEnable_flag(){
		return enable_flag;
	}

	public String getTab_name(){
		return tab_name;
	}

	public String getCol_name(){
		return col_name;
	}

	public String getDict_val(){
		return dict_val;
	}

	public Integer getOrder_val(){
		return order_val;
	}

	public void setDict_id(String dict_id){
		this.dict_id=dict_id;
	}

	public void setDict_key(String dict_key){
		this.dict_key=dict_key;
	}

	public void setEnable_flag(String enable_flag){
		this.enable_flag=enable_flag;
	}

	public void setTab_name(String tab_name){
		this.tab_name=tab_name;
	}

	public void setCol_name(String col_name){
		this.col_name=col_name;
	}

	public void setDict_val(String dict_val){
		this.dict_val=dict_val;
	}

	public void setOrder_val(Integer order_val){
		this.order_val=order_val;
	}

}
