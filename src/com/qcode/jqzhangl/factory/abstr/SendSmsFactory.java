package com.qcode.jqzhangl.factory.abstr;

import com.qcode.jqzhangl.factory.Sender;
import com.qcode.jqzhangl.factory.impl.MailSender;
import com.qcode.jqzhangl.factory.impl.SmsSender;

/**
 * Created by Administrator on 2016/11/28.
 */
public class SendSmsFactory {

    public Sender produce(){
        return new SmsSender();
    }
}