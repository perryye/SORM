package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_acct_role {

	private String acct_id;
	private String role_id;


	public String getAcct_id(){
		return acct_id;
	}

	public String getRole_id(){
		return role_id;
	}

	public void setAcct_id(String acct_id){
		this.acct_id=acct_id;
	}

	public void setRole_id(String role_id){
		this.role_id=role_id;
	}

}
