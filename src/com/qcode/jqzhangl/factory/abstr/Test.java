package com.qcode.jqzhangl.factory.abstr;

import com.qcode.jqzhangl.factory.Sender;

/**
 * Created by Administrator on 2016/11/28.
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}