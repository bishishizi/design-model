package com.bugubiao.design.model.observer;

/**
 * 面向接口编程
 *
 * 抽象被观察者接口 , 被观察者具体实现的功能
 * 声明了添加、删除、通知观察者方法
 *
 * @author wangwenchang
 * @date 2018/6/13 13:45
 */
public interface CustomObserverable {

    /**
     * 观察者注册
     * @param o 具体观察者
     */
    void registerObserver(CustomObserver o);

    /**
     * 移除观察者
     * @param o 具体观察者
     */
    void removeObserver(CustomObserver o);

    /**
     * 遍历观察者
     */
    void notifyObserver();
}
