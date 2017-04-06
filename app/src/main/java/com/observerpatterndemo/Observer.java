package com.observerpatterndemo;

import android.widget.TextView;

/**
 * TODO<抽象观察者>
 *
 * @author: 小嵩
 * @date: 2017/4/5 17:24
 */

public interface Observer {

     public void update(String msg, TextView tv);
}