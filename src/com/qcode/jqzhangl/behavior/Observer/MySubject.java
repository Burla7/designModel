package com.qcode.jqzhangl.behavior.Observer;

/**
 * Created by Administrator on 2017/2/9.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}