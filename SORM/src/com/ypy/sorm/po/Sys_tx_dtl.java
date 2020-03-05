package com.ypy.sorm.po;

import java.sql.*;
import java.util.*;
public class Sys_tx_dtl {

	private java.sql.Timestamp resp_tm;
	private String tx_flag;
	private String tx_cd;
	private String tx_dtl_rmk1;
	private String err_code;
	private String tx_id;
	private String tx_rmk;
	private String op_code;
	private java.sql.Date tx_dt;
	private String acct_id;
	private String err_msg;
	private java.sql.Timestamp req_tm;
	private String tx_dtl_rmk3;
	private String tx_dtl_rmk2;


	public java.sql.Timestamp getResp_tm(){
		return resp_tm;
	}

	public String getTx_flag(){
		return tx_flag;
	}

	public String getTx_cd(){
		return tx_cd;
	}

	public String getTx_dtl_rmk1(){
		return tx_dtl_rmk1;
	}

	public String getErr_code(){
		return err_code;
	}

	public String getTx_id(){
		return tx_id;
	}

	public String getTx_rmk(){
		return tx_rmk;
	}

	public String getOp_code(){
		return op_code;
	}

	public java.sql.Date getTx_dt(){
		return tx_dt;
	}

	public String getAcct_id(){
		return acct_id;
	}

	public String getErr_msg(){
		return err_msg;
	}

	public java.sql.Timestamp getReq_tm(){
		return req_tm;
	}

	public String getTx_dtl_rmk3(){
		return tx_dtl_rmk3;
	}

	public String getTx_dtl_rmk2(){
		return tx_dtl_rmk2;
	}

	public void setResp_tm(java.sql.Timestamp resp_tm){
		this.resp_tm=resp_tm;
	}

	public void setTx_flag(String tx_flag){
		this.tx_flag=tx_flag;
	}

	public void setTx_cd(String tx_cd){
		this.tx_cd=tx_cd;
	}

	public void setTx_dtl_rmk1(String tx_dtl_rmk1){
		this.tx_dtl_rmk1=tx_dtl_rmk1;
	}

	public void setErr_code(String err_code){
		this.err_code=err_code;
	}

	public void setTx_id(String tx_id){
		this.tx_id=tx_id;
	}

	public void setTx_rmk(String tx_rmk){
		this.tx_rmk=tx_rmk;
	}

	public void setOp_code(String op_code){
		this.op_code=op_code;
	}

	public void setTx_dt(java.sql.Date tx_dt){
		this.tx_dt=tx_dt;
	}

	public void setAcct_id(String acct_id){
		this.acct_id=acct_id;
	}

	public void setErr_msg(String err_msg){
		this.err_msg=err_msg;
	}

	public void setReq_tm(java.sql.Timestamp req_tm){
		this.req_tm=req_tm;
	}

	public void setTx_dtl_rmk3(String tx_dtl_rmk3){
		this.tx_dtl_rmk3=tx_dtl_rmk3;
	}

	public void setTx_dtl_rmk2(String tx_dtl_rmk2){
		this.tx_dtl_rmk2=tx_dtl_rmk2;
	}

}
