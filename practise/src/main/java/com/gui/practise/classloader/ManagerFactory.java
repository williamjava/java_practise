package com.gui.practise.classloader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 加载manager的工厂
 * 
 * @author wuhoujian
 *
 */
public class ManagerFactory {
	// 记录热加载类的加载信息
	private static final Map<String, LoadInfo> loadTimeMap = new HashMap<String, LoadInfo>();
	// 要加载的类的classpath
	public static final String CLASS_PATH = "/Users/wuhoujian/Documents/myself/projects/java_practise/practise/target/classes/";
	// 实现热加载的类的全路径
	public static final String MY_MANAGER = "com.gui.practise.classloader.MyManager";

	public static BaseManager getManager(String className) {
		File loadFile = new File(CLASS_PATH + className.replaceAll("\\.", "/") + ".class");
		Long lastModified = loadFile.lastModified();

		if (loadTimeMap.get(className) == null) {
			// 类没有被加载，需要加载到jvm
			load(className, lastModified);
		} else if (loadTimeMap.get(className).getLoadTime() != lastModified) {
			// 加载类的时间戳发生了变化，重新加载类到jvm
			load(className, lastModified);
		}

		return loadTimeMap.get(className).getManager();
	}

	private static void load(String className, Long lastModified) {
		MyClassLoader myClassLoader = new MyClassLoader(CLASS_PATH);
		Class<?> loadClass = null;
		try {
			loadClass = myClassLoader.loadClass(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		BaseManager manager = newInstance(loadClass);
		LoadInfo loadInfo = new LoadInfo(myClassLoader, lastModified);
		loadInfo.setManager(manager);

		loadTimeMap.put(className, loadInfo);
	}

	/**
	 * 通过反射创建BaseManager的子类对象
	 * 
	 * @param loadClass
	 * @return
	 */
	private static BaseManager newInstance(Class<?> loadClass) {
		try {
			return (BaseManager) loadClass.getConstructor(new Class[] {}).newInstance(new Object[] {});
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
