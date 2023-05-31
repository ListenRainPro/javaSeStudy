package com.xuan;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/16 22:01
 * @introduction:
 */
public class SuperArray {

    //数组
    private int[] array;
    //游标
    private int arrayIndex = 0;

    public SuperArray(){

        this(10);
    }

    public SuperArray(int x){
        array = new int[x];
    }

    //添加一个元素
    public void add(int element){

        //数组到达上限时，扩容
        if(arrayIndex > array.length - 1){
            int[] array2 = new int[array.length * 2];
            array = array2;
        }
        array[arrayIndex] = element;
        arrayIndex++;
    }

    //删除一个元素
    public void delete(int elementIndex){

        if (judge(elementIndex)){
            for (int i = elementIndex; i < array.length - 1; i++) {
                array[elementIndex] = array[elementIndex + 1];
            }
            arrayIndex--;
        }

    }

    //查找一个元素
    public int find(int elementIndex){

        if (judge(elementIndex)){
            return array[elementIndex];
        }else {
            return -1;
        }


    }

    //修改一个元素
    public void  alter(int element,int elementIndex){

        if (judge(elementIndex)) {
            array[elementIndex] = element;
        }
    }

    //遍历显示数组
    public void arrarToString(){
        for (int i = 0; i < arrayIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean judge(int elementIndex){
        if (elementIndex<0 || elementIndex>arrayIndex){
            System.out.println("下标["+elementIndex+"]不存在");
            return false;
        }
        return true;
    }

}
