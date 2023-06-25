package com.xuan.abstractAndInferface;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/6/25 13:46
 * @Description:
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(this.name+"在吃");
    }
}
