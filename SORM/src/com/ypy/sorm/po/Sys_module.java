package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_module {

	private String pmodule_id;
	private String module_type;
	private String help_title;
	private String module_valid;
	private String big_icon;
	private String module_nm;
	private String module_id;
	private String param_opcode;
	private String module_hide;
	private String small_icon;
	private String module_url;
	private Integer module_order;
	private String module_opcode;
	private String module_target;
	private String help_page;


	public String getPmodule_id(){
		return pmodule_id;
	}

	public String getModule_type(){
		return module_type;
	}

	public String getHelp_title(){
		return help_title;
	}

	public String getModule_valid(){
		return module_valid;
	}

	public String getBig_icon(){
		return big_icon;
	}

	public String getModule_nm(){
		return module_nm;
	}

	public String getModule_id(){
		return module_id;
	}

	public String getParam_opcode(){
		return param_opcode;
	}

	public String getModule_hide(){
		return module_hide;
	}

	public String getSmall_icon(){
		return small_icon;
	}

	public String getModule_url(){
		return module_url;
	}

	public Integer getModule_order(){
		return module_order;
	}

	public String getModule_opcode(){
		return module_opcode;
	}

	public String getModule_target(){
		return module_target;
	}

	public String getHelp_page(){
		return help_page;
	}

	public void setPmodule_id(String pmodule_id){
		this.pmodule_id=pmodule_id;
	}

	public void setModule_type(String module_type){
		this.module_type=module_type;
	}

	public void setHelp_title(String help_title){
		this.help_title=help_title;
	}

	public void setModule_valid(String module_valid){
		this.module_valid=module_valid;
	}

	public void setBig_icon(String big_icon){
		this.big_icon=big_icon;
	}

	public void setModule_nm(String module_nm){
		this.module_nm=module_nm;
	}

	public void setModule_id(String module_id){
		this.module_id=module_id;
	}

	public void setParam_opcode(String param_opcode){
		this.param_opcode=param_opcode;
	}

	public void setModule_hide(String module_hide){
		this.module_hide=module_hide;
	}

	public void setSmall_icon(String small_icon){
		this.small_icon=small_icon;
	}

	public void setModule_url(String module_url){
		this.module_url=module_url;
	}

	public void setModule_order(Integer module_order){
		this.module_order=module_order;
	}

	public void setModule_opcode(String module_opcode){
		this.module_opcode=module_opcode;
	}

	public void setModule_target(String module_target){
		this.module_target=module_target;
	}

	public void setHelp_page(String help_page){
		this.help_page=help_page;
	}

}
