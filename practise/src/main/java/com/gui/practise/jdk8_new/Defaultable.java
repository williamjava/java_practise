package com.gui.practise.jdk8_new;

public interface Defaultable {
    /**
     * 接口的默认方法，使用default关键字
     * @return
     */
    default String notRequired(){
        return "Default implemention";
    }
}
