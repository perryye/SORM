package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_imp_cfg_dtl {

	private String fld_caption;
	private String allow_blank;
	private String data_tp;
	private String def_val;
	private String dtl_id;
	private String def_val_tp;
	private Integer Sort_Val;
	private String PK_Flg;
	private String imp_id;
	private String fld_nm;


	public String getFld_caption(){
		return fld_caption;
	}

	public String getAllow_blank(){
		return allow_blank;
	}

	public String getData_tp(){
		return data_tp;
	}

	public String getDef_val(){
		return def_val;
	}

	public String getDtl_id(){
		return dtl_id;
	}

	public String getDef_val_tp(){
		return def_val_tp;
	}

	public Integer getSort_Val(){
		return Sort_Val;
	}

	public String getPK_Flg(){
		return PK_Flg;
	}

	public String getImp_id(){
		return imp_id;
	}

	public String getFld_nm(){
		return fld_nm;
	}

	public void setFld_caption(String fld_caption){
		this.fld_caption=fld_caption;
	}

	public void setAllow_blank(String allow_blank){
		this.allow_blank=allow_blank;
	}

	public void setData_tp(String data_tp){
		this.data_tp=data_tp;
	}

	public void setDef_val(String def_val){
		this.def_val=def_val;
	}

	public void setDtl_id(String dtl_id){
		this.dtl_id=dtl_id;
	}

	public void setDef_val_tp(String def_val_tp){
		this.def_val_tp=def_val_tp;
	}

	public void setSort_Val(Integer Sort_Val){
		this.Sort_Val=Sort_Val;
	}

	public void setPK_Flg(String PK_Flg){
		this.PK_Flg=PK_Flg;
	}

	public void setImp_id(String imp_id){
		this.imp_id=imp_id;
	}

	public void setFld_nm(String fld_nm){
		this.fld_nm=fld_nm;
	}

}
