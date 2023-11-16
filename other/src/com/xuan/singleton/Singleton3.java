package com.xuan.singleton;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/8 12:05
 * @Description: TODO
 */
public class Singleton3 {

    //不让别人new
    private Singleton3(){
    }

    //获取实例
    public static Singleton3 getSingleton(){
        return SingletHolder.SINGLETON_3;
    }

    //静态内部类会在第一次使用的使用的时候加载一次，静态常量会在类加载初始化后，一次
    private static class SingletHolder{
        private static final Singleton3 SINGLETON_3 = new Singleton3();
    }

}
