package com.gui.practise.base.transmit;

public class ObjectTransmit {
    public static void main(String[] args) {
        User user1 = new User("william", 28);
        User user2 = new User("Ya", 29);
        swap(user1, user2);

        System.out.println("user1's age is : " + user1.getAge());
        System.out.println("user2's age is : " + user2.getAge());
    }

    private static void swap(User u1, User u2) {
        User temp = u1;
        u1 = u2;
        u2 = temp;

        System.out.println("u1's age is : " + u1.getAge());
        System.out.println("u2's age is : " + u2.getAge());
    }
}
