package com.gui.practise.base;

/**
 * 普通的门，不需要报警，只具有开和关两个行为
 */
public class SimpleDoor extends AbstractDoor {
    @Override
    void open() {
        System.out.println("Simple door open...");
    }

    @Override
    void close() {
        System.out.println("Simple door close...");
    }
}
