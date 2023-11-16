package com.xuan.javacore.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/9/19 11:13
 * @Description: TODO
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] a = {1,5,8,64,65,16,8,15,33,15,94};

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a,94));

        System.out.println(Arrays.binarySearch(a,0,5,94));

        int[] b ;
        b = Arrays.copyOf(a,a.length);
        int[] c = Arrays.copyOfRange(a,0,5);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.equals(b,c));

        Arrays.fill(a,0,5,6);
        System.out.println(Arrays.toString(a));

        List list = Arrays.asList(a);
        System.out.println(list.toString());
    }
}
