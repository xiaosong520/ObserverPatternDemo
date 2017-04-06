package com.observerpatterndemo;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO<具体主题（具体被观察者）>
 *
 * @author: 小嵩
 * @date: 2017/4/5 17:29
 */

public class XiaosongSubject implements Subject {

    //用于保存订阅了小嵩的博客的用户
    private List<Observer> mPersonList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        mPersonList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        mPersonList.remove(observer);
    }

    @Override
    public void notify(String message, TextView tv) {
        for (Observer observer : mPersonList) {
            observer.update(message,tv);
        }
    }
}