package com.gui.practise.classloader;

/**
 * 后台启动一个线程，不断刷新，重新加载实现了热加载的类
 * 
 * @author wuhoujian
 *
 */
public class MessageHandler implements Runnable {

	@Override
	public void run() {
		while(true){
			BaseManager manager = ManagerFactory.getManager(ManagerFactory.MY_MANAGER);
			manager.logic();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
