package com.qcode.design.Creational.singleton;

/**
 * 单例模式（IoDH）
 * 通过内部类加载特性 第一次调用加载 既保证了线程安全性 也保证了性能
 * Created by jiaqi,zhang on 2017/8/1.
 */
class Singleton {
    private Singleton() {
    }

    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String args[]) {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}