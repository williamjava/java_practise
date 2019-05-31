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
 *
 * JDK动态代理所用到的代理类在程序调用到代理类对象时才由JVM真正创建，JVM根据传进来的 业务实现类对象 以及 方法名 ，动态地创建了一个代理类的class文件并被字节码引擎执行，
 *
 * 然后通过该代理类对象进行方法调用。
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
