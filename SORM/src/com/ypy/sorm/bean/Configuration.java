package com.ypy.sorm.bean;

/**
 * 管理配置信息
 * @author DELL
 *
 */
public class Configuration {
	/*
	 * 驱动类
	 */
	private String driver;
	/*
	 * jdbc的url
	 */
	private String url;
	/*
	 * 数据库的用户名
	 */
	private String user;
	/*
	 * 数据库的密码
	 */
	private String pwd;
	/*
	 * 使用的数据库类型
	 */
	private String usingDB;
	/*
	 * 项目的源码路径
	 */
	private String srcPath;
	/*
	 * 扫描生成java类的包（po的意思：Persistence object持久化对象）
	 */
	private String poPakege;
	
	/*
	 * 项目使用的查询类是哪一个
	 */
	private String queryClass;
	
	public Configuration() {
		// TODO Auto-generated constructor stub
	}

	public Configuration(String driver, String url, String user, String pwd, String usingDB, String srcPath,
			String poPakege) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pwd = pwd;
		this.usingDB = usingDB;
		this.srcPath = srcPath;
		this.poPakege = poPakege;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUsingDB() {
		return usingDB;
	}

	public void setUsingDB(String usingDB) {
		this.usingDB = usingDB;
	}

	public String getSrcPath() {
		return srcPath;
	}

	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getPoPakege() {
		return poPakege;
	}

	public void setPoPakege(String poPakege) {
		this.poPakege = poPakege;
	}

	public String getQueryClass() {
		return queryClass;
	}

	public void setQueryClass(String queryClass) {
		this.queryClass = queryClass;
	}
	
	
	
}
