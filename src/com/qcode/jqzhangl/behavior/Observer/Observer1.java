package com.qcode.jqzhangl.behavior.Observer;

/**
 * Created by Administrator on 2017/2/9.
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}