package com.gui.practise.annotation;

import java.lang.reflect.Method;

/**
 * 注解测试类
 * 
 * 使用反射获取注解相关信息
 * 
 * @author wuhoujian
 *
 */
public class UserIntroTest {

	public static void main(String[] args) {
		Class userClass = User.class;
		Method[] methods = userClass.getMethods();
		for (Method method : methods) {
			UserIntro userIntro = method.getAnnotation(UserIntro.class);
			if (userIntro != null) {
				System.out.println("姓名：" + userIntro.name() + " 联系电话：" + userIntro.phone());
			}
		}
	}

}
