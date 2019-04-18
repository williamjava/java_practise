package com.gui.practise.proxy.statical;

/**
 * 静态代理测试
 *
 * 在编译时就已经将接口，被代理类，代理类等确定下来。
 *
 * 在程序运行之前，代理类的.class文件就已经生成。
 */
public class EmployeeProxyTest {
    public static void main(String[] args) {
        Employee employee = new Employee("William");
        EmployeeProxy proxy = new EmployeeProxy(employee);
        proxy.checkin();
    }
}
