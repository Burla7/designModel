package com.qcode.jqzhangl.factory.normal;

import com.qcode.jqzhangl.factory.Sender;
import com.qcode.jqzhangl.factory.impl.MailSender;
import com.qcode.jqzhangl.factory.impl.SmsSender;

/**
 * Created by Administrator on 2016/11/21.
 */
public class StaticFactory {
    public static Sender MailSender(){
        return  new MailSender();
    }
    public static Sender SmsSender(){
        return  new SmsSender();
    }
}
