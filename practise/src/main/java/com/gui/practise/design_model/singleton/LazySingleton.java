package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * 延迟加载，需要的时候才进行实例的创建，解决饿汉式存在的问题。
 * 
 * *优点：
 * 
 * 1.单例模式在内存中只有一个实例，减少内存开支，当一个对象需要频繁创建销毁时就适合使用单例；
 * 
 * 2.当一个对象的生成耗费资源较多时，可以在应用启动时直接生成一个单例对象（传统的JDBC编程成，数据库连接等）；
 * 
 * 缺点：
 * 
 * 1.单例模式没有接口，是一个纯粹的类，扩展困难，若要扩展，只有修改源码；
 * 
 * 2.该方式在单线程的情况不会有问题，如果式多线程环境，就会出现线程不安全的问题；
 * 
 * @author wuhoujian
 *
 */
public class LazySingleton {
	// 1.系统初始化的时候不会马上实例化
	private static LazySingleton singleton = null;

	// 2.私有的构造方法
	private LazySingleton() {

	}

	/*
	 * 3.公共的访问实例的放方法
	 * 
	 * 第一次调用该方法获取实例的时候，实例化
	 */
	public static LazySingleton getInstance() {
		// 可处理其他业务逻辑 TODO

		try {
			/*
			 * if判断存在线程安全问题
			 */
			if (singleton == null) {
				System.out.println("当前线程名称为：" + Thread.currentThread().getName());

				Thread.sleep(300);
				singleton = new LazySingleton();

				System.out.println(singleton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 可处理其他业务逻辑 TODO

		return singleton;
	}
}
