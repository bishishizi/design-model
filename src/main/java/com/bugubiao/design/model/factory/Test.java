package com.bugubiao.design.model.factory;

/**
 *  测试主类
 * @author wangwenchang
 * @date 2018/6/13 9:59
 */
public class Test {

    public static void main(String[] args) {
        FruitsFactory fruitsFactory = new FruitsFactory();
        Fruits apple = fruitsFactory.fruits("Apple");
        apple.name();

        apple = fruitsFactory.fruits("Banana");
        apple.name();
    }
}
