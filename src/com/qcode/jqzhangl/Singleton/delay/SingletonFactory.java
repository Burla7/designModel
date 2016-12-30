package com.qcode.jqzhangl.Singleton.delay;

/**
 * (延迟加载) 将类的创建以及类的实例化分开
 * Created by Administrator on 2016/12/20.
 */
public class SingletonFactory {

    private static SingletonFactory instance = null;

    private SingletonFactory() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonFactory();
        }
    }

    public static SingletonFactory getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
