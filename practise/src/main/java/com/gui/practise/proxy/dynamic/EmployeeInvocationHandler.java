package com.gui.practise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler<T> implements InvocationHandler {
    private T target;

    public EmployeeInvocationHandler(T target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行了" + method.getName() + "方法");

        return method.invoke(target, args);
    }
}
