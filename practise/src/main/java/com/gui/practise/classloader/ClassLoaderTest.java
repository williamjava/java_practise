package com.gui.practise.classloader;


/**
 * 测试热加载
 * 
 * @author wuhoujian
 *
 */
public class ClassLoaderTest {
	public static void main(String[] args) {
		new Thread(new MessageHandler()).start();;
	}
}
