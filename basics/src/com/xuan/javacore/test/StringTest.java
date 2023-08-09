package com.xuan.javacore.test;

import java.util.Date;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/9 9:33
 * @Description: TODO
 */
public class StringTest {
    public static void main(String[] args) {
        /**
         * 空对象的引用，比较
         * 调用空对象的方法，属性会报错 空指针
         */
        String a = "";
        String b = null;
        Date c = null;
        System.out.println(a.equals(c));

        System.out.println(a.concat("bc"));
        System.out.println("abcdef".substring(0,4));
        // equals 字符串比较

        // substring 字符串截取
        "abdcde".substring(0,4);
        String t = "abdbdbd";
        "abdcde".substring(t.length()-4);

        // indexOf 字符串判断 "abdcde".indexOf("p")

        // lastIndexOf

        // contains 字符串判断

        // replace 替换 "abdcd".replace("d","a") replaceAll







    }



}
