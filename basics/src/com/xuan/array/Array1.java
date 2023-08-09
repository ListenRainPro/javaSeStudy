package com.xuan.array;

import java.util.Scanner;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/14 20:35
 * @introduction:
 */
public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        int y = -1;
        int a = 0;

        int[] xxx = new int[]{1,2,3,4,5};

        while (x){
            System.out.println("1.新建工号");
            System.out.println("2.查找工号");
            System.out.println("3.退出");
            int z = scanner.nextInt();

            if (z == 1){
                System.out.println("请输入新建工号:");
                a = scanner.nextInt();
                xxx = aaa(xxx,a);

            }else if (z == 2){
                System.out.println("请查找的工号:");
                a = scanner.nextInt();
                bbb(xxx,a);

            }else if (z == 3){
                System.out.println("已退出");
                x = false;

            }else {
                System.out.println("输入非法字符");
            }


        }



    }

    //
    public static int[] aaa(int[] a,int b){

        int[] aaa = new int[a.length +1];

        for (int i = 0; i < a.length; i++) {
            aaa[i] = a[i];
        }
        aaa[aaa.length -1] = b;

        return aaa;
    }

    //
    public static void bbb(int[] a,int b){


        for (int i = 0; i < a.length; i++) {

            if (a[i] == b){
                System.out.println(i);
                break;
            }
            if (i == a.length -1){
                System.out.println("工号不存在");
            }

        }


    }
}
