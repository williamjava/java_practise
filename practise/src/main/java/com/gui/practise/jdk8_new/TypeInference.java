package com.gui.practise.jdk8_new;

/**
 * 更好的类型推断
 */
public class TypeInference {
    public static void main(String[] args) {
        final Value<String> value = new Value<>();
        //在这里，Value.defaultValue()的类型由编译器自动推断得出
        System.out.println(value.getOrDefault("22", Value.defaultValue()));
    }
}