package com.xuan.abstractAndInferface;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/6/25 13:44
 * @Description：
 */
public abstract class Animal {

    protected String name;

    public Animal (){
        this.name = "tom";
    }

    abstract void eat();

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}
