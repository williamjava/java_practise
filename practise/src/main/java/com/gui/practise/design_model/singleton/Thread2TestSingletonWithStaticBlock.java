package com.gui.practise.design_model.singleton;

/**
 * 测试静态代码块单例模式的线程安全行
 * 
 * @author wuhoujian
 *
 */
public class Thread2TestSingletonWithStaticBlock implements Runnable {
	/**
	 * 从运行结果上可以看出：输出的实例变量的hashCode值一致，这就说明是同一个对象。
	 * 
	 */
	public static void main(String[] args) {
		// 1.创建10个线程
		Thread2TestSingletonWithStaticBlock[] threads = new Thread2TestSingletonWithStaticBlock[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread2TestSingletonWithStaticBlock();
		}

		// 2.开始执行步骤1中创建的10个线程
		for (int j = 0; j < threads.length; j++) {
			threads[j].run();
		}
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is running....");
		System.out.println(SingletonWithStaticBlock.getInstance().hashCode());
	}
}
