package com.ypy.sorm.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ypy.sorm.bean.ColumnInfo;
import com.ypy.sorm.bean.JavaFileGetSet;
import com.ypy.sorm.bean.TableInfo;
import com.ypy.sorm.core.DBManager;
import com.ypy.sorm.core.MySqlTypeConvertor;
import com.ypy.sorm.core.TableContext;
import com.ypy.sorm.core.TypeConvertor;

/**
 * 封装了生产java文件（源代码）的常用操作
 * @author DELL
 *
 */
public class JavaFileUtils {
	
	/**
	 * 根据字段信息生成java属性信息，如：varchar username-->private String username;以及get、set方法源码
	 * @param column 字段信息
	 * @param convertor 类型转化器
	 * @return 返回java属性和get、set方法
	 */
	public static JavaFileGetSet createFieldGetSetSrc(ColumnInfo column, TypeConvertor convertor){
		JavaFileGetSet jfgs = new JavaFileGetSet();
		String javaFieldType = convertor.databaseType2JavaType(column.getDataType());
		jfgs.setFieldInfo("\tprivate " + javaFieldType + " " + column.getName() + ";\n");
		
		//public String getUsername(){return username}
		//生成get方法的源代码
		StringBuilder getSrc = new StringBuilder();
		getSrc.append("\tpublic " + javaFieldType + " get" + StringUtils.firstChar2UperCase(column.getName()) + "(){\n");
		getSrc.append("\t\treturn " + column.getName() + ";\n");
		getSrc.append("\t}\n");
		jfgs.setGetInfo(getSrc.toString());
		
		//public void setUsername(String username){this.username=username;}
		//生成set方法的源代码
		StringBuilder setSrc = new StringBuilder();
		setSrc.append("\tpublic void set" + StringUtils.firstChar2UperCase(column.getName()) + "(");
		setSrc.append(javaFieldType + " " + column.getName() + "){\n");
		setSrc.append("\t\tthis." + column.getName() + "=" + column.getName() + ";\n");
		setSrc.append("\t}\n");
		jfgs.setSetInfo(setSrc.toString());
		
		return jfgs;
	}
	
	/**
	 * 根据信息生成java类的源代码
	 * @param tableInfo 表信息
	 * @param convertor 数据类型转化器
	 * @return
	 */
	public static String createJavaSrc(TableInfo tableInfo, TypeConvertor convertor){
		Map<String, ColumnInfo> columns = tableInfo.getColumns();
		List<JavaFileGetSet> javaFiles = new ArrayList<JavaFileGetSet>();
		
		for(ColumnInfo c:columns.values()){
			javaFiles.add(createFieldGetSetSrc(c, convertor));
		}
		
		StringBuilder src = new StringBuilder();
		//生成packege语句
		src.append("package " + DBManager.getConf().getPoPakege() + ";\n\n");
		//生成import语句
		src.append("import java.sql.*;\n");
		src.append("import java.util.*;\n");
		//生成类声明语句
		src.append("public class " + StringUtils.firstChar2UperCase(tableInfo.getTname()) + " {\n\n");
		//生成属性列表
		for(JavaFileGetSet f:javaFiles){
			src.append(f.getFieldInfo());
		}
		src.append("\n\n");
		//生成get方法
		for(JavaFileGetSet f:javaFiles){
			src.append(f.getGetInfo() + "\n");
		}
		//生成set方法
		for(JavaFileGetSet f:javaFiles){
			src.append(f.getSetInfo() + "\n");
		}
		//生成类结束
		src.append("}\n");
		
//		System.out.println(src);
		return src.toString();
	}
	
	public static void createJavaPOFile(TableInfo tableInfo, TypeConvertor convertor){
		String src = createJavaSrc(tableInfo, convertor);
		
		String srcPath = DBManager.getConf().getSrcPath() + "\\";
		String packegePath = DBManager.getConf().getPoPakege().replaceAll("\\.", "/");
		
		File f = new File(srcPath + packegePath);
		
		if(!f.exists()){ //如果确定目录不存在，则帮助用户创建
			f.mkdir();
		}
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(srcPath + packegePath + "/" 
					+ StringUtils.firstChar2UperCase(tableInfo.getTname()) + ".java"));
			bw.write(src);
			System.out.println("建立表" + tableInfo.getTname() + "对应的java类：" 
					+ StringUtils.firstChar2UperCase(tableInfo.getTname() + ".java"));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null){
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
//		ColumnInfo ci = new ColumnInfo("username", "varchar", 0);
//		ColumnInfo ci = new ColumnInfo("id", "int", 0);
//		JavaFileGetSet f = createFieldGetSetSrc(ci, new MySqlTypeConvertor());
//		System.out.println(f);
		
		Map<String, TableInfo> map = TableContext.tables;
//		TableInfo t = map.get("sys_account");
//		createJavaSrc(t, new MySqlTypeConvertor());
		for (TableInfo t:map.values()) {
			createJavaPOFile(t, new MySqlTypeConvertor());
		}
	}

}
