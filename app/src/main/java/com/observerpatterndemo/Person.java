package com.observerpatterndemo;

import android.widget.TextView;

/**
 * TODO<具体观察者>
 *
 * @author: 小嵩
 * @date: 2017/4/5 17:24
 */

public class Person implements Observer {

    // 用户名
    private String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg, TextView tv) {
        tv.setText(tv.getText()+name+":"+ msg +"\n");
    }

}
