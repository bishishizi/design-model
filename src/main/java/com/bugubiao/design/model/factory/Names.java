package com.bugubiao.design.model.factory;

/**
 * 水果类
 *
 * @author wangwenchang
 * @date 2018/6/13 9:57
 */
public enum Names {
    APPLE("Apple"), BANANA("Banana");

    private String value;

    Names(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
