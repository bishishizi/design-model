package com.bugubiao.design.model.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 测试主类
 *
 * @author wangwenchang
 * @date 2018/6/13 9:59
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        test1();
        test2();
    }

    public static void test2() throws Exception {
        Properties properties = new Properties();
        File file = new File("fruit.properties");
        if (file.exists()) {
            properties.load(new FileInputStream(file));
        }else{
            properties.setProperty("apple", "com.bugubiao.design.model.factory.Apple");
            properties.setProperty("orange", "com.bugubiao.design.model.factory.banana");
            properties.store(new FileOutputStream(file), "FRUIT CLASS");
        }



        FruitsFactory fruitsFactory = new FruitsFactory();
        Fruits apple =  fruitsFactory.reflectionFruits(properties.getProperty("apple"));
        apple.name();

        apple =  fruitsFactory.reflectionFruits(properties.getProperty("banana"));
        apple.name();
    }

    public static void test1() {
        FruitsFactory fruitsFactory = new FruitsFactory();
        Fruits apple = fruitsFactory.fruits("Apple");
        apple.name();

        apple = fruitsFactory.fruits("Banana");
        apple.name();
    }
}
