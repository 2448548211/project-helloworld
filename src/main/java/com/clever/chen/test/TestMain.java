package com.clever.chen.test;

/**
 * 获取当前类的包名
 * @author ChenWang
 * @className TestMain
 * @date 2020/11/14 14:16
 * @since JDK 1.8
 */
public class TestMain {
    public static void main(String[] args) {
        String packageName = TestMain.class.getPackage().getName();
        String packageName2 = new TestMain().getClass().getPackage().getName();
        System.out.println(packageName);
        System.out.println(packageName2);
    }
}
