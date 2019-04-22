package com.gui.practise.jdk8_new;

import java.util.Arrays;
import java.util.List;

/**
 * 引用类型
 */
public class CarTest {
    public static void main(String[] args) {
        //构造器引用
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);

        //静态方法引用
        cars.forEach(Car::collide);

        //类的成员方法引用
        cars.forEach(Car::repair);

        //实例对象的成员方法引用
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }
}
