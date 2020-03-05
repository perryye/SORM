package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_data_item {

	private String di_comment;
	private Integer di_length;
	private String di_editor;
	private String di_id;
	private Integer di_precision;
	private String di_def_val;
	private String di_type;
	private String di_title;
	private String di_desc;


	public String getDi_comment(){
		return di_comment;
	}

	public Integer getDi_length(){
		return di_length;
	}

	public String getDi_editor(){
		return di_editor;
	}

	public String getDi_id(){
		return di_id;
	}

	public Integer getDi_precision(){
		return di_precision;
	}

	public String getDi_def_val(){
		return di_def_val;
	}

	public String getDi_type(){
		return di_type;
	}

	public String getDi_title(){
		return di_title;
	}

	public String getDi_desc(){
		return di_desc;
	}

	public void setDi_comment(String di_comment){
		this.di_comment=di_comment;
	}

	public void setDi_length(Integer di_length){
		this.di_length=di_length;
	}

	public void setDi_editor(String di_editor){
		this.di_editor=di_editor;
	}

	public void setDi_id(String di_id){
		this.di_id=di_id;
	}

	public void setDi_precision(Integer di_precision){
		this.di_precision=di_precision;
	}

	public void setDi_def_val(String di_def_val){
		this.di_def_val=di_def_val;
	}

	public void setDi_type(String di_type){
		this.di_type=di_type;
	}

	public void setDi_title(String di_title){
		this.di_title=di_title;
	}

	public void setDi_desc(String di_desc){
		this.di_desc=di_desc;
	}

}
