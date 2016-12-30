package com.qcode.jqzhangl.Singleton.update;

import java.util.Vector;

/**
 * 通过readCount的控制加减进行同步操作
 */
public class GlobalConfig {
    private static GlobalConfig instance;
    private Vector properties = null;
    private boolean isUpdating = false;
    private int readCount = 0;

    private GlobalConfig() {
        //Load configuration information from DB or file
        //Set values for properties
    }


    public synchronized void update(String p_data) {
        syncUpdateIn();
        //Update properties进行更改资源操作
    }

    private synchronized void syncUpdateIn() {
        while (readCount > 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
    }

    private synchronized void syncReadIn() {
        readCount++;
    }

    private synchronized void syncReadOut() {
        readCount--;
        notifyAll();//使所有原来在该对象上等待被notify的线程统统退出wait的状态，变成等待该对象上的锁，一旦该对象被解锁，他们就会去竞争。
    }

    public Vector getProperties() {
        syncReadIn();
        //Process data//更新单例数据
        syncReadOut();
        return properties;
    }
}