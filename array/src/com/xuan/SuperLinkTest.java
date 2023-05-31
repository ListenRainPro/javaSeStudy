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

        //����1 906  ����2 209 ����3 17
        //superLink.sort();
        //superLink.sort2();
        superLink.sort3();
        long end = System.currentTimeMillis();
        System.out.println("��ʱ:"+(end- start)+"����");
        //superLink.delete(3);


        //superLink.alter(2,4);

        System.out.println(superLink.linkToString());


    }
}
