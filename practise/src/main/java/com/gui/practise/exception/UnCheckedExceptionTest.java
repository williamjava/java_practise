package com.gui.practise.exception;

/**
 * 不可检查异常(运行时异常，如NullPointerException)测试类
 *
 * 严谨地编码基本上可以避免，我们可以根据实际情况进行适当处理。
 */
public class UnCheckedExceptionTest {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.toString());//这里应为调用了String对象的方法，但是String对象为null，会抛出一个NullPointerException异常。
    }
}
