package com.gui.practise.base;

/**
 * int和Integer的区别
 *
 * 第一印象：int是基本数据类型，Integer是int的包装类；int的初始值为0，Integer的初始值为null。
 */
public class IntegerTest {
    public static void main(String[] args) {
        /**
         *1.无论如何，Integer与new Integer不会相等。
         *
         * 下面会输出false
         */
        Integer i1 = 100;//i1指向常量池
        Integer i2 = new Integer(100);//i2指向堆
        System.out.println(i1 == i2);

        System.out.println("*****************************");

        /**
         *2.两个都不是new出来的Integer，如果数在-128到127之间，则是true,否则为false
         *
         * 下面输出true和false
         */
        Integer i3 = 125;//编译的时候会被编译为Integer.valueOf(125)
        Integer i4 = 125;
        Integer i33 = 200;
        Integer i44 = 200;
        System.out.println(i3 == i4);
        System.out.println(i33 == i44);

        System.out.println("****************");

        /**
         * 3.两个都是new出来的,都为false
         *
         * 下面输出false
         */
        Integer i5 = new Integer(100);
        Integer i6 = new Integer(100);
        System.out.println(i5 == i6);

        System.out.println("*************");

        /**
         * 4.int和integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比
         *
         * 下面输出true和true
         */
        int i7 = 200;
        Integer i8 = 200;
        Integer i88 = new Integer(200);
        System.out.println(i7 == i8);
        System.out.println(i7 == i88);
    }
}
