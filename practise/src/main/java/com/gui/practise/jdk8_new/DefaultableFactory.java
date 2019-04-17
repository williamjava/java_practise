package com.gui.practise.jdk8_new;

import java.util.function.Supplier;

public interface DefaultableFactory {
    /**
     * 静态方法
     * @param supplier
     * @return
     */
    static Defaultable create(Supplier<Defaultable> supplier){
        return supplier.get();
    }
}
