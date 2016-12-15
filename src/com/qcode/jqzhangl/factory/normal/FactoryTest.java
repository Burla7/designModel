package com.qcode.jqzhangl.factory.normal;

import com.qcode.jqzhangl.factory.Sender;

/**
 * Created by Administrator on 2016/11/21.
 */
public class FactoryTest {

    /*第一种如果传入的字符串有误，不能正确创建对象
    第三种相对于第二种，不需要实例化工厂类
    所以，大多数情况下，我们会选用第三种——静态工厂方法模式。*/
    public static void main(String[] args) {
        StaticTest();
    }

    /*普通工厂模式*/
    public static void NormalTest() {
        Sender sender = new NormalSendFactory().produce("mai");
        if (sender != null) {
            sender.Send();
        }
    }

    /*多种工厂模式*/
    public static void MoreTest() {
        MoreSendFactory sendFactory = new MoreSendFactory();
        Sender sender = sendFactory.SenderSms();
        sender.Send();
        ;
    }

    /*静态工厂模式*/
    public static void StaticTest() {
        Sender sender = StaticFactory.MailSender();
        sender.Send();
    }
}
