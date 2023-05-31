package com.xuan;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/16 22:18
 * @introduction:
 */
public class SuperArrayTest {

    public static void main(String[] args) {
        SuperArray superArray = new SuperArray();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            superArray.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ºÄÊ±:"+(end- start)+"ºÁÃë");
        superArray.delete(3);

        superArray.find(3);

        superArray.alter(10,3);

        superArray.find(5);
    }



}
