package com.gui.practise.proxy.statical;

public class Employee implements Person{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    @Override
    public void checkin() {
        System.out.println(name + "上班打卡成功...");
    }
}
