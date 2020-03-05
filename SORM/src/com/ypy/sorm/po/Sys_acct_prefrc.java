package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_acct_prefrc {

	private String acct_id;
	private String remark;
	private String prefrc_category;
	private String setting_key;
	private String remark1;
	private String setting_val;
	private String remark3;
	private String remark2;


	public String getAcct_id(){
		return acct_id;
	}

	public String getRemark(){
		return remark;
	}

	public String getPrefrc_category(){
		return prefrc_category;
	}

	public String getSetting_key(){
		return setting_key;
	}

	public String getRemark1(){
		return remark1;
	}

	public String getSetting_val(){
		return setting_val;
	}

	public String getRemark3(){
		return remark3;
	}

	public String getRemark2(){
		return remark2;
	}

	public void setAcct_id(String acct_id){
		this.acct_id=acct_id;
	}

	public void setRemark(String remark){
		this.remark=remark;
	}

	public void setPrefrc_category(String prefrc_category){
		this.prefrc_category=prefrc_category;
	}

	public void setSetting_key(String setting_key){
		this.setting_key=setting_key;
	}

	public void setRemark1(String remark1){
		this.remark1=remark1;
	}

	public void setSetting_val(String setting_val){
		this.setting_val=setting_val;
	}

	public void setRemark3(String remark3){
		this.remark3=remark3;
	}

	public void setRemark2(String remark2){
		this.remark2=remark2;
	}

}
