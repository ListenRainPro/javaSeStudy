package com.xuan;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/17 20:40
 * @introduction:
 */
public class SuperLinkTest {
    public static void main(String[] args) {

        SuperLink superLink = new SuperLink();
        for (int i = 0; i < 1000; i++) {
            superLink.add((int)(Math.random()*10000));
        }
        long start = System.currentTimeMillis();

        //方法1 906  方法2 209 方法3 17
        //superLink.sort();
        //superLink.sort2();
        superLink.sort3();
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end- start)+"毫秒");
        //superLink.delete(3);


        //superLink.alter(2,4);

        System.out.println(superLink.linkToString());


    }
}
