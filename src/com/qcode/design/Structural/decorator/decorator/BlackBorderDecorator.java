package com.qcode.design.Structural.decorator.decorator;

import com.qcode.design.Structural.decorator.Component;
import com.qcode.design.Structural.decorator.ComponentDecorator;

/**
 * Created by jiaqi,zhang on 2017/8/29.
 */
public class BlackBorderDecorator extends ComponentDecorator
{
    public BlackBorderDecorator(Component component)
    {
        super(component);
    }

    public void display()
    {
        this.setBlackBorder();
        super.display();
    }

    public  void setBlackBorder()
    {
        System.out.println("为构件增加黑色边框！");
    }
}