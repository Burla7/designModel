package com.qcode.jqzhangl.factory.impl;

import com.qcode.jqzhangl.factory.Sender;

/**
 * Created by Administrator on 2016/11/21.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is SmsSender");
    }
}
