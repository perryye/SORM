package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_tx_conf {

	private String tx_nm;
	private String disest_flag;
	private String tx_cd;
	private String log_flag;
	private Integer flow_num;
	private String login_flag;
	private String op_code;
	private String token_flag;
	private String tx_rmk1;
	private String param_opcode;
	private String tx_rmk2;
	private String tx_rmk3;
	private String disest_clazz;


	public String getTx_nm(){
		return tx_nm;
	}

	public String getDisest_flag(){
		return disest_flag;
	}

	public String getTx_cd(){
		return tx_cd;
	}

	public String getLog_flag(){
		return log_flag;
	}

	public Integer getFlow_num(){
		return flow_num;
	}

	public String getLogin_flag(){
		return login_flag;
	}

	public String getOp_code(){
		return op_code;
	}

	public String getToken_flag(){
		return token_flag;
	}

	public String getTx_rmk1(){
		return tx_rmk1;
	}

	public String getParam_opcode(){
		return param_opcode;
	}

	public String getTx_rmk2(){
		return tx_rmk2;
	}

	public String getTx_rmk3(){
		return tx_rmk3;
	}

	public String getDisest_clazz(){
		return disest_clazz;
	}

	public void setTx_nm(String tx_nm){
		this.tx_nm=tx_nm;
	}

	public void setDisest_flag(String disest_flag){
		this.disest_flag=disest_flag;
	}

	public void setTx_cd(String tx_cd){
		this.tx_cd=tx_cd;
	}

	public void setLog_flag(String log_flag){
		this.log_flag=log_flag;
	}

	public void setFlow_num(Integer flow_num){
		this.flow_num=flow_num;
	}

	public void setLogin_flag(String login_flag){
		this.login_flag=login_flag;
	}

	public void setOp_code(String op_code){
		this.op_code=op_code;
	}

	public void setToken_flag(String token_flag){
		this.token_flag=token_flag;
	}

	public void setTx_rmk1(String tx_rmk1){
		this.tx_rmk1=tx_rmk1;
	}

	public void setParam_opcode(String param_opcode){
		this.param_opcode=param_opcode;
	}

	public void setTx_rmk2(String tx_rmk2){
		this.tx_rmk2=tx_rmk2;
	}

	public void setTx_rmk3(String tx_rmk3){
		this.tx_rmk3=tx_rmk3;
	}

	public void setDisest_clazz(String disest_clazz){
		this.disest_clazz=disest_clazz;
	}

}
