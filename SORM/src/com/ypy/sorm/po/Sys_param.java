package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_param {

	private String param_en_nm;
	private String mdf_usr;
	private String param_val;
	private String param_zh_nm;
	private String enable_flag;
	private java.sql.Timestamp mdf_date;
	private String crt_usr;
	private String remark1;
	private java.sql.Timestamp crt_date;
	private String remark3;
	private String remark2;


	public String getParam_en_nm(){
		return param_en_nm;
	}

	public String getMdf_usr(){
		return mdf_usr;
	}

	public String getParam_val(){
		return param_val;
	}

	public String getParam_zh_nm(){
		return param_zh_nm;
	}

	public String getEnable_flag(){
		return enable_flag;
	}

	public java.sql.Timestamp getMdf_date(){
		return mdf_date;
	}

	public String getCrt_usr(){
		return crt_usr;
	}

	public String getRemark1(){
		return remark1;
	}

	public java.sql.Timestamp getCrt_date(){
		return crt_date;
	}

	public String getRemark3(){
		return remark3;
	}

	public String getRemark2(){
		return remark2;
	}

	public void setParam_en_nm(String param_en_nm){
		this.param_en_nm=param_en_nm;
	}

	public void setMdf_usr(String mdf_usr){
		this.mdf_usr=mdf_usr;
	}

	public void setParam_val(String param_val){
		this.param_val=param_val;
	}

	public void setParam_zh_nm(String param_zh_nm){
		this.param_zh_nm=param_zh_nm;
	}

	public void setEnable_flag(String enable_flag){
		this.enable_flag=enable_flag;
	}

	public void setMdf_date(java.sql.Timestamp mdf_date){
		this.mdf_date=mdf_date;
	}

	public void setCrt_usr(String crt_usr){
		this.crt_usr=crt_usr;
	}

	public void setRemark1(String remark1){
		this.remark1=remark1;
	}

	public void setCrt_date(java.sql.Timestamp crt_date){
		this.crt_date=crt_date;
	}

	public void setRemark3(String remark3){
		this.remark3=remark3;
	}

	public void setRemark2(String remark2){
		this.remark2=remark2;
	}

}
