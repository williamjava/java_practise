package com.gui.practise.proxy.statical;

/**
 * 静态代理测试
 * <p>
 * 在编译时就已经将接口，被代理类，代理类等确定下来。
 * <p>
 * 一个代理类只能对一个业务接口的实现类进行包装，如果有多个业务接口的话就要定义很多实现类和代理类才行。
 * <p>
 * 而且，如果代理类对业务方法的预处理、调用后操作都是一样的（比如：调用前输出提示、调用后自动关闭连接），则多个代理类就会有很多重复代码。
 * <p>
 * 这时我们可以定义这样一个代理类，它能代理所有实现类的方法调用：根据传进来的业务实现类和方法名进行具体调用。——那就是动态代理。
 * <p>
 * 在程序运行之前，代理类的.class文件就已经生成。
 */
public class EmployeeProxyTest {
    public static void main(String[] args) {
        Employee employee = new Employee("William");
        EmployeeProxy proxy = new EmployeeProxy(employee);
        proxy.checkin();
    }
}
