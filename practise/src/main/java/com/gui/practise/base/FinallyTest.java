package com.gui.practise.base;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            // do something
            System.out.println("this is try...");
//            System.exit(1);
//            return;
        } finally{
            System.out.println("this is finally...");
        }
    }
}
