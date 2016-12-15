package com.qcode.jqzhangl.factory.abstr;

import com.qcode.jqzhangl.factory.Sender;
import com.qcode.jqzhangl.factory.impl.MailSender;

/**
 * Created by Administrator on 2016/11/28.
 */
public class SendMailFactory implements  Provider {

    public Sender produce(){
        return new MailSender();
    }
}