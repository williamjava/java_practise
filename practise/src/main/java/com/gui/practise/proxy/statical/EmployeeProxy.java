package com.gui.practise.proxy.statical;

public class EmployeeProxy implements Person {
    private Employee employee;

    public EmployeeProxy(Employee employee){
        this.employee = employee;
    }

    @Override
    public void checkin() {
        System.out.println("由于起床晚了，来不及打卡！");
        employee.checkin();
    }
}
