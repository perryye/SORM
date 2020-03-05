package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_role {

	private String role_exclude;
	private String role_type;
	private String role_id;
	private String org_id;
	private String role_enabled;
	private String role_nm;
	private String role_desc;
	private String role_extend;


	public String getRole_exclude(){
		return role_exclude;
	}

	public String getRole_type(){
		return role_type;
	}

	public String getRole_id(){
		return role_id;
	}

	public String getOrg_id(){
		return org_id;
	}

	public String getRole_enabled(){
		return role_enabled;
	}

	public String getRole_nm(){
		return role_nm;
	}

	public String getRole_desc(){
		return role_desc;
	}

	public String getRole_extend(){
		return role_extend;
	}

	public void setRole_exclude(String role_exclude){
		this.role_exclude=role_exclude;
	}

	public void setRole_type(String role_type){
		this.role_type=role_type;
	}

	public void setRole_id(String role_id){
		this.role_id=role_id;
	}

	public void setOrg_id(String org_id){
		this.org_id=org_id;
	}

	public void setRole_enabled(String role_enabled){
		this.role_enabled=role_enabled;
	}

	public void setRole_nm(String role_nm){
		this.role_nm=role_nm;
	}

	public void setRole_desc(String role_desc){
		this.role_desc=role_desc;
	}

	public void setRole_extend(String role_extend){
		this.role_extend=role_extend;
	}

}
