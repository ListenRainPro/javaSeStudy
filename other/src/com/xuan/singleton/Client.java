package com.xuan.singleton;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/8 12:01
 * @Description: TODO
 */
public class Client {
    public static void main(String[] args) {
        //验证是否获取的同意对象
        Singleton sl = Singleton.getSingleton();
        Singleton sl2 = Singleton.getSingleton();
        Singleton sl3 = Singleton.getSingleton();
        System.out.println(sl==sl2);
        System.out.println(sl2==sl3);
        System.out.println(sl==sl3);
        System.out.println("--------------");

        Singleton2 sl21 = Singleton2.getSingleton();
        Singleton2 sl22 = Singleton2.getSingleton();
        Singleton2 sl23 = Singleton2.getSingleton();
        System.out.println(sl21==sl22);
        System.out.println(sl22==sl23);
        System.out.println(sl21==sl23);
        System.out.println("--------------");

        Singleton3 sl31 = Singleton3.getSingleton();
        Singleton3 sl32 = Singleton3.getSingleton();
        Singleton3 sl33 = Singleton3.getSingleton();
        System.out.println(sl31==sl32);
        System.out.println(sl32==sl33);
        System.out.println(sl31==sl33);
    }
}
