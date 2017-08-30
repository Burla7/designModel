package com.qcode.design.Structural.decorator.compents;


import com.qcode.design.Structural.decorator.Component;

/**
 * 文本框类：具体构件类
 * Created by jiaqi,zhang on 2017/8/29.
 */
 public class TextBox extends Component
{
    public  void display()
    {
        System.out.println("显示文本框！");
    }
}