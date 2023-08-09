package com.xuan.array;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/16 10:12
 * @introduction:
 */
public class MergerArray {
    public static void main(String[] args) {

        //�ṩ������������
        int[] array1 = {1, 2, 3,4,4,5};
        int a = 0;
        int[] array2 = {3, 4, 5, 7};
        int b = 0;

        int[] newArray = new int[array1.length + array2.length];
        int x = 0;

        while (a != array1.length || b != array2.length){

            if (a == array1.length){
                newArray[x]=array2[b];
                b++;
                x++;
                continue;
            }else if (b == array2.length){
                newArray[x]=array1[a];
                a++;
                x++;
                continue;
            }

            if (array1[a] <= array2[b]){

                newArray[x]=array1[a];
                a++;
                x++;
            }else {
                newArray[x]=array2[b];
                b++;
                x++;
            }

        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
