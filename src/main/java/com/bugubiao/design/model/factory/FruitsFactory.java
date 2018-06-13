package com.bugubiao.design.model.factory;

/**
 *  工厂
 * @author wangwenchang
 * @date 2018/6/13 9:55
 */
public class FruitsFactory {

    public Fruits fruits( String name){
        Fruits fruits = null;
        if (Names.APPLE.getValue().equals(name )){
            fruits = new Apple();
        }
        if (Names.BANANA.getValue().equals(name )){
            fruits = new Banana();
        }
        return fruits;
    }

    public Fruits reflectionFruits(String name) throws Exception {
        Fruits fruits = null;
        fruits = (Fruits) Class.forName(name).newInstance();

        return fruits;
    }

}
