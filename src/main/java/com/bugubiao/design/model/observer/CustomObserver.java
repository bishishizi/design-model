package com.bugubiao.design.model.observer;

/**
 *  面向接口编程
 *
 *  抽象观察者 ,观察者
 *  定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 *
 * @author wangwenchang
 * @date 2018/6/13 13:48
 */
public interface CustomObserver {

     /**
      * 当被观察者发送改变时用来更新观察者信息
      * @param message
      */
     void update(String message);
}
