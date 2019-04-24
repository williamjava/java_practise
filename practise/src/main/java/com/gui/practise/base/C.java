package com.gui.practise.base;

/**
 * 重载
 *
 * 同一个类中，方法名相同，参数的个数不同、参数的类型不同或参数的顺序不同
 */
public class C {
    public void method(){
        System.out.println("This is method....");
    }

    public void method(String name){
        System.out.println("This is method with param name...");
    }

    public void method(String name, Integer age){
        System.out.println("This is method with param name and age...");
    }

    public void method(Integer age, String name){
        System.out.println("This is method with param age and name...");
    }

    /**
     * 重载和方法发的返回值类型无关，这个方法在这里编译不通过
     * @param name
     * @param age
     * @return
     */
    //public String method(String name, Integer age){
        //return null;
    //}
}
