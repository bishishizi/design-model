package com.bugubiao.design.model.observer;

/**
 * 观察者
 * 微信公众号的具体观察者为用户User
 *
 * @author wangwenchang
 * @date 2018/6/13 14:03
 */
public class User implements CustomObserver{

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    /**
     * 更新消息时读取最新消息
     * @param message
     */
    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
