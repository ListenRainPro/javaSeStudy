package com.xuan.singleton;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/8 11:46
 * @Description: TODO
 */
public class Singleton {
    //初始化一个
    private static final Singleton singleton = new Singleton();

    //不让别人new
    private Singleton(){

    }

    //保证别人能获取
    public static Singleton getSingleton() {
        return singleton;
    }

}
