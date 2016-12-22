package com.qcode.jqzhangl.Singleton;

/**
 * Created by Administrator on 2016/12/20.
 */
public class SingletongNei {


        /* 私有构造方法，防止被实例化 */
        private SingletongNei() {
        }

        /* 此处使用一个内部类来维护单例 */    //利用创建类时线程互斥 将高并发中可能出现的类初始化不一致从而导致的错误解决
        private static class SingletonFactory {
            private static SingletongNei instance = new SingletongNei();
        }

        /* 获取实例 */
        public static SingletongNei getInstance() {
            return SingletonFactory.instance;
        }

        /* 如果该对象被用于序列化，可以保证对    象在序列化前后保持一致 */
        public Object readResolve() {
            return getInstance();
        }
}
