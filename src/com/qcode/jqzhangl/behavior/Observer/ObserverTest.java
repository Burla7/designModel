package com.qcode.jqzhangl.behavior.Observer;

/**
 * Created by Administrator on 2017/2/9.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        Observer1 observer1 = new Observer1();
        sub.add(observer1);
        sub.add(new Observer2());
        sub.del(observer1);

        sub.operation();
    }

}
