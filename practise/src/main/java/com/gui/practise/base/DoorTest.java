package com.gui.practise.base;

/**
 * 测试类
 */
public class DoorTest {
    public static void main(String[] args) {
        AlarmDoor alarmDoor = new AlarmDoor();
        alarmDoor.open();
        alarmDoor.alarm();
        alarmDoor.close();

        SimpleDoor simpleDoor = new SimpleDoor();
        simpleDoor.open();
        simpleDoor.close();
    }
}
