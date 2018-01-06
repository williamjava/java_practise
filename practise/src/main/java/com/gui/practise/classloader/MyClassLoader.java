package com.gui.practise.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * 自定义Java类加载器来实现Java类的热加载
 * 
 * @author wuhoujian
 *
 */
public class MyClassLoader extends ClassLoader {
	// 要加载的java类的classpaht路径
	private String classpath;

	public MyClassLoader(String classpath) {
		super(ClassLoader.getSystemClassLoader());
		this.classpath = classpath;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		byte[] data = this.loadClassData(name);
		return this.defineClass(name, data, 0, data.length);
	}

	/**
	 * 加载class文件中的内容
	 * 
	 * @param name
	 * @return
	 */
	private byte[] loadClassData(String name) {
		try {
			name = name.replace(".", "//");
			FileInputStream is = new FileInputStream(new File(classpath + name + ".class"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int b = 0;
			while ((b = is.read()) != -1) {
				baos.write(b);
			}
			is.close();
			return baos.toByteArray();
		} catch (Exception e) {
			System.out.println("加载class文件中的内容出现异常" + e);
		}

		return null;
	}

}
