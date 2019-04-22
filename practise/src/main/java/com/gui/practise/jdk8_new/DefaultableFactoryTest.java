package com.gui.practise.jdk8_new;

public class DefaultableFactoryTest {
    public static void main(String[] args) {
        Defaultable defaultable = DefaultableFactory.create(DefaultableImpl::new);
        System.out.println(defaultable.notRequired());

        defaultable = DefaultableFactory.create(DefaultableOverride::new);
        System.out.println(defaultable.notRequired());
    }
}
