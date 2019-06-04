package com.gui.practise.proxy.cglib;

/**
 * CGLIB实现动态代理测试类
 *
 * cglib是在运行时通过操作字节码来完成类的扩展和改变
 */
public class BookFacadeCglibTest {
    public static void main(String[] args) {
        BookFacadeImpl bookFacade = new BookFacadeImpl();
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl bookFacadeCglib = (BookFacadeImpl) cglib.getInstance(bookFacade);
        bookFacadeCglib.addBook();
    }
}
