package com.observerpatterndemo;

import android.widget.TextView;

/**
 * TODO<抽象主题>
 *
 * @author: 小嵩
 * @date: 2017/4/5 17:26
 */

public interface Subject {
    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * 删除观察者
     * @param observer
     */
    public void detach(Observer observer);
    /**
     * 通知观察者
     */
    public void notify(String message, TextView v);
}