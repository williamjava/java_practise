package com.gui.practise.proxy.cglib;

public class BookFacadeCglibTest {
    public static void main(String[] args) {
        BookFacadeImpl bookFacade = new BookFacadeImpl();
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl bookFacadeCglib = (BookFacadeImpl) cglib.getInstance(bookFacade);
        bookFacadeCglib.addBook();
    }
}
