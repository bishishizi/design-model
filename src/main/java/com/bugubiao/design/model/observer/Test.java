package com.bugubiao.design.model.observer;

/**
 * @author wangwenchang
 * @date 2018/6/13 14:16
 */
public class Test {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        CustomObserver userZhang = new User("ZhangSan");
        CustomObserver userLi = new User("LiSi");
        CustomObserver userWang = new User("WangWu");

        //添加观察者
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        //张三退出订阅
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
    }
}
