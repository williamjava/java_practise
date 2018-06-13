package com.gui.practise.design_model.singleton;

/**
 * 测试懒汉式单例模式的线程安全行
 * 
 * @author wuhoujian
 *
 */
public class Thread2TestLazySingleton extends Thread {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is running....");
		System.out.println(LazySingleton.getInstance().hashCode());
	}

	/**
	 * 从运行结果上可以看出：输出的实例变量的hashCode值不一致。
	 * 
	 */
	public static void main(String[] args) {
		// 1.创建10个线程
		Thread2TestLazySingleton[] threads = new Thread2TestLazySingleton[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread2TestLazySingleton();
		}

		// 2.开始执行步骤1中创建的10个线程
		for (int j = 0; j < threads.length; j++) {
			threads[j].start();
		}
	}

}
