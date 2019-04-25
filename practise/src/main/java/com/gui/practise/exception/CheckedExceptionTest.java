package com.gui.practise.exception;

import java.io.File;
import java.io.IOException;

/**
 * 可检查异常测试类
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        File file = new File("/e/test_file");
        try {
            file.createNewFile();//操作文件的方法，抛出了IOException
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
