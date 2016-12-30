package com.qcode.jqzhangl.Builder;

import com.qcode.jqzhangl.factory.Sender;
import com.qcode.jqzhangl.factory.impl.MailSender;
import com.qcode.jqzhangl.factory.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * Created by Administrator on 2016/12/30.
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
