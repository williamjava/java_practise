package com.gui.practise.base;

/**
 * 可报警的门
 *
 * 除了具有开和关两个行为，还具有报警行为
 */
public class AlarmDoor extends AbstractDoor implements IAlarm {
    @Override
    void open() {
        System.out.println("Alarm door open...");
    }

    @Override
    void close() {
        System.out.println("Alarm door close...");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm door alarm...");
    }
}
