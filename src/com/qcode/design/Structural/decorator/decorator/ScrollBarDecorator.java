package com.qcode.design.Structural.decorator.decorator;


import com.qcode.design.Structural.decorator.Component;
import com.qcode.design.Structural.decorator.ComponentDecorator;

/**
 * 滚动条装饰类:具体装饰类
 * Created by jiaqi,zhang on 2017/8/29.
 */
public class ScrollBarDecorator extends ComponentDecorator {


    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display()
    {
        this.setScrollBar();
        super.display();
    }

    public  void setScrollBar()
    {
        System.out.println("为构件增加滚动条！");
    }
}
