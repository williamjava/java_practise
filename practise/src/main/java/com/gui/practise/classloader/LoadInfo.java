package com.gui.practise.classloader;

/**
 * 封装加载类的信息
 * 
 * @author wuhoujian
 *
 */
public class LoadInfo {
	/*
	 * 自定义的类加载器
	 */
	private MyClassLoader myLoader;

	/*
	 * 记录要加载的类的时间戳，加载的时间
	 */
	private Long loadTime;

	private BaseManager manager;

	public LoadInfo(MyClassLoader myLoader, Long loadTime) {
		super();
		this.myLoader = myLoader;
		this.loadTime = loadTime;
	}

	public BaseManager getManager() {
		return manager;
	}

	public void setManager(BaseManager manager) {
		this.manager = manager;
	}

	public MyClassLoader getMyLoader() {
		return myLoader;
	}

	public void setMyLoader(MyClassLoader myLoader) {
		this.myLoader = myLoader;
	}

	public Long getLoadTime() {
		return loadTime;
	}

	public void setLoadTime(Long loadTime) {
		this.loadTime = loadTime;
	}

}
