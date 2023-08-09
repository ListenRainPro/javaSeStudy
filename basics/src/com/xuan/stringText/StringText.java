package com.xuan.stringText;

import java.util.Date;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/8 17:42
 * @Description: TODO
 */
public class StringText {
    public static void main(String[] args) {

        /**
         * (1) 先定义一个名为s1的对String类的对象引用变量放入栈中。
         *
         * (2) 在常量池中查找是否存在内容为"xuan"字符串对象。
         * (3) 如果不存在则在常量池中创建"xuan"，并让s1引用该对象。
         * (4) 如果存在则直接让str引用该对象。
         */
        String s1 = "xuan";
        String s2 = "xuan";
        //true
        System.out.println(s1 == s2);

        /**
         * (1) 先定义一个名为s3的对String类的对象引用变量放入栈中。
         *
         * (2) 然后在堆中（不是常量池）创建一个指定的对象，并让s3引用指向该对象。
         *
         * (3) 在常量池中查找是否存在内容为"xuan"字符串对象。
         * (4) 如果不存在，则在常量池中创建内容为"xuan"的字符串对象，并将堆中的对象与之联系起来。
         * (5) 如果存在，则将new出来的字符串对象与字符串常量池中的对象联系起来（即让那个特殊的成员变量value的指针指向它）
         */
        String s3 = new String("xuan");
        String s4 = new String("xuan");
        //false
        System.out.println(s3 == s4);
        //false  s1指向常量池”xuan“ s3指向堆中的对象，其对象再指向常量池”xuan“
        System.out.println(s1 == s3);


        //返回字符串长度
        System.out.println(s1.length());
        System.out.println("------------------------");

        //拼接字符串
        //concat()只能拼接字符串，+号 可以任意类型
        System.out.println(s1.concat(s2));
        //相当于System.out.println(new StringBuffer.append(s1).append("shuai").toString())
        //编译成class文件时，会自动编译成StringBuffer来进行字符串拼接操作
        System.out.println(s1+"shuai");
        System.out.println("------------------------");

        //创建格式化字符串(静态方法dormat())，由格式转换符决定
        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", 1.1, 10,"abc");
        Date date = new Date();
        System.out.println(String.format("%tF",date));
        System.out.println("------------------------");




    }
}
