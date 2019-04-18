package com.gui.practise.proxy.dynamic;

import com.gui.practise.proxy.statical.Employee;
import com.gui.practise.proxy.statical.Person;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 *
 * 代理类在程序运行时创建的代理方式被成为动态代理。
 *
 * 相比于静态代理，动态代理的优势在于可以很方便的对代理类的函数进行统一的处理，而不用修改每个代理类中的方法。
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        //创建被代理对象
        Employee employee = new Employee("Jack");
        //创建Handler
        EmployeeInvocationHandler handler = new EmployeeInvocationHandler(employee);
        //创建代理对象
        Person employeeProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, handler);
        //开始打卡
        employeeProxy.checkin();
    }
}
