package com.qcode.jqzhangl.factory.normal;

import com.qcode.jqzhangl.factory.Sender;
import com.qcode.jqzhangl.factory.impl.MailSender;
import com.qcode.jqzhangl.factory.impl.SmsSender;

/**
 * Created by Administrator on 2016/11/21.
 */
public class MoreSendFactory {
    public Sender SenderMail() {
        return new MailSender();
    }

    public Sender SenderSms() {
        return new SmsSender();
    }
}
