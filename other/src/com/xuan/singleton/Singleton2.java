package com.xuan.singleton;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/8 12:05
 * @Description: TODO
 */
public class Singleton2 {
    //初始化一个
    private static Singleton2 singleton2;

    //不让别人new
    private Singleton2(){

    }

    //保证别人能获取
    public static Singleton2 getSingleton() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
