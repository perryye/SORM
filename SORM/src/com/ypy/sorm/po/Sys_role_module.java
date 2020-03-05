package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_role_module {

	private String module_id;
	private String role_id;


	public String getModule_id(){
		return module_id;
	}

	public String getRole_id(){
		return role_id;
	}

	public void setModule_id(String module_id){
		this.module_id=module_id;
	}

	public void setRole_id(String role_id){
		this.role_id=role_id;
	}

}
