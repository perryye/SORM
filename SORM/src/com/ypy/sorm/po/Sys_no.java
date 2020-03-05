package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_no {

	private String month_reset;
	private Integer cache_size;
	private String prefix;
	private String no_status;
	private String no_id;
	private String postfix;
	private String no_name;
	private Integer no_length;
	private String year_reset;
	private String day_reset;
	private java.math.BigDecimal next_id;


	public String getMonth_reset(){
		return month_reset;
	}

	public Integer getCache_size(){
		return cache_size;
	}

	public String getPrefix(){
		return prefix;
	}

	public String getNo_status(){
		return no_status;
	}

	public String getNo_id(){
		return no_id;
	}

	public String getPostfix(){
		return postfix;
	}

	public String getNo_name(){
		return no_name;
	}

	public Integer getNo_length(){
		return no_length;
	}

	public String getYear_reset(){
		return year_reset;
	}

	public String getDay_reset(){
		return day_reset;
	}

	public java.math.BigDecimal getNext_id(){
		return next_id;
	}

	public void setMonth_reset(String month_reset){
		this.month_reset=month_reset;
	}

	public void setCache_size(Integer cache_size){
		this.cache_size=cache_size;
	}

	public void setPrefix(String prefix){
		this.prefix=prefix;
	}

	public void setNo_status(String no_status){
		this.no_status=no_status;
	}

	public void setNo_id(String no_id){
		this.no_id=no_id;
	}

	public void setPostfix(String postfix){
		this.postfix=postfix;
	}

	public void setNo_name(String no_name){
		this.no_name=no_name;
	}

	public void setNo_length(Integer no_length){
		this.no_length=no_length;
	}

	public void setYear_reset(String year_reset){
		this.year_reset=year_reset;
	}

	public void setDay_reset(String day_reset){
		this.day_reset=day_reset;
	}

	public void setNext_id(java.math.BigDecimal next_id){
		this.next_id=next_id;
	}

}
