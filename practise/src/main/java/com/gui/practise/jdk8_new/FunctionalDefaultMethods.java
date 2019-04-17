package com.gui.practise.jdk8_new;

/**
 * 函数式接口(只有一个接口)
 */
@FunctionalInterface
public interface FunctionalDefaultMethods {
    void method();

    default void defaultMethod(){

    }
}
