package com.qcode.jqzhangl.factory.abstr;

import com.qcode.jqzhangl.factory.Sender;

/**
 * Created by Administrator on 2016/11/28.
*/
public interface Provider {
    public Sender produce();
}
