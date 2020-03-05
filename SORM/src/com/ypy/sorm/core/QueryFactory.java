package com.ypy.sorm.core;

/**
 * 创建Query对象的工厂类
 * @author DELL
 *
 */
public class QueryFactory {
	
	
	private static QueryFactory factory = new QueryFactory();
	
	private static Query prototypeObj; //原型对象
	
	static {
		try {
			Class c = Class.forName(DBManager.getConf().getQueryClass()); //加载指定的Query类
			prototypeObj = (Query) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//私有构造器
	private QueryFactory() {
	}
	
	public Query createQuery(){
		return prototypeObj;
	}
}
