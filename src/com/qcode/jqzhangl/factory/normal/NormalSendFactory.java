package com.qcode.jqzhangl.factory.normal;

import com.qcode.jqzhangl.factory.Sender;
import com.qcode.jqzhangl.factory.impl.MailSender;
import com.qcode.jqzhangl.factory.impl.SmsSender;

/**
 * Created by Administrator on 2016/11/21.
 */
public class NormalSendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {

            return  new MailSender();
        } else if ("sms".equals(type)) {
            return  new SmsSender();
        }else{
            System.out.println("请输入正确的类型");
            return  null;
        }
    }
}
