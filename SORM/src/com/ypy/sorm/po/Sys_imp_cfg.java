package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_imp_cfg {

	private String tbl_en_nm;
	private String imp_nm;
	private String after_proc;
	private String allow_row;
	private Integer start_col;
	private Integer sheet_idx;
	private Integer start_pt;
	private String before_proc;
	private String imp_tp;
	private String imp_id;


	public String getTbl_en_nm(){
		return tbl_en_nm;
	}

	public String getImp_nm(){
		return imp_nm;
	}

	public String getAfter_proc(){
		return after_proc;
	}

	public String getAllow_row(){
		return allow_row;
	}

	public Integer getStart_col(){
		return start_col;
	}

	public Integer getSheet_idx(){
		return sheet_idx;
	}

	public Integer getStart_pt(){
		return start_pt;
	}

	public String getBefore_proc(){
		return before_proc;
	}

	public String getImp_tp(){
		return imp_tp;
	}

	public String getImp_id(){
		return imp_id;
	}

	public void setTbl_en_nm(String tbl_en_nm){
		this.tbl_en_nm=tbl_en_nm;
	}

	public void setImp_nm(String imp_nm){
		this.imp_nm=imp_nm;
	}

	public void setAfter_proc(String after_proc){
		this.after_proc=after_proc;
	}

	public void setAllow_row(String allow_row){
		this.allow_row=allow_row;
	}

	public void setStart_col(Integer start_col){
		this.start_col=start_col;
	}

	public void setSheet_idx(Integer sheet_idx){
		this.sheet_idx=sheet_idx;
	}

	public void setStart_pt(Integer start_pt){
		this.start_pt=start_pt;
	}

	public void setBefore_proc(String before_proc){
		this.before_proc=before_proc;
	}

	public void setImp_tp(String imp_tp){
		this.imp_tp=imp_tp;
	}

	public void setImp_id(String imp_id){
		this.imp_id=imp_id;
	}

}
