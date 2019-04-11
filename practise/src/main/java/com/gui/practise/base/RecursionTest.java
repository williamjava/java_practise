package com.gui.practise.base;

/**
 * 递归算法
 */
public class RecursionTest {
    public static void main(String[] args) {
        System.out.println("1-100之间的数字之和为：" + sum(100));
        System.out.println("斐波那契数列中第20个数是多少：" + fun(20));
        System.out.println("10阶乘是多少：" + multipy(10));
    }

    /**
     * 1-100之间的数字之和
     * @param num
     * @return
     */
    private static Integer sum(int num){
       if (num == 1) {
           return 1;
       } else {
           return num * multipy(num - 1);
       }
    }

    /**
     * 斐波那契数列(获取第20个数)
     * 斐波那契数列数列从第3项开始，每一项都等于前两项之和。
     * 例子：数列 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368........
     * @return
     */
    private static Integer fun(Integer n){
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fun(n - 1) + fun(n-2);
        }
    }

    /**
     * 10阶乘
     * @param num
     * @return
     */
    private static Integer multipy(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * multipy(num - 1);
        }
    }
}
