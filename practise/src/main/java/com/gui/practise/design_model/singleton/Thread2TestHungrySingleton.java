package com.gui.practise.design_model.singleton;

/**
 * 测试饿汉式单例模式的线程安全行
 * 
 * @author wuhoujian
 *
 */
public class Thread2TestHungrySingleton extends Thread {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is running....");
		System.out.println(HungrySingleton.getInstance().hashCode());
	}

	/**
	 * 从运行结果上可以看出：输出的实例变量的hashCode值一致，这就说明是同一个对象。
	 * 
	 */
	public static void main(String[] args) {
		// 1.创建10个线程
		Thread2TestHungrySingleton[] threads = new Thread2TestHungrySingleton[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread2TestHungrySingleton();
		}

		// 2.开始执行步骤1中创建的10个线程
		for (int j = 0; j < threads.length; j++) {
			threads[j].start();
		}
	}

}
