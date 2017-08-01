package com.qcode.design.Creational.singleton;

/**
 * 饿汉模式
 * 通过初始化 实例化该类
 * Created by jiaqi,zhang on 2017/8/1.
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
