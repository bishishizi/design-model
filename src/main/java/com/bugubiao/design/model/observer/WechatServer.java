package com.bugubiao.design.model.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务 ,这里主要提供注册,移除,遍历的功能
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * 当被观察者的信息发送改变时,观察者的信息也对应的发送改变
 *
 * @author wangwenchang
 * @date 2018/6/13 13:52
 */
public class WechatServer implements CustomObserverable {

    private List<CustomObserver> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(CustomObserver o) {
        list.add(o);
    }

    @Override
    public void removeObserver(CustomObserver o) {
        if (!list.isEmpty()){
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (CustomObserver customObserver : list) {
            customObserver.update(message);
        }

    }


    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
