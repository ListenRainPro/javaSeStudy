package com.xuan.array;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/16 22:01
 * @introduction:
 */
public class SuperArray {

    //����
    private int[] array;
    //�α�
    private int arrayIndex = 0;

    public SuperArray(){

        this(10);
    }

    public SuperArray(int x){
        array = new int[x];
    }

    //���һ��Ԫ��
    public void add(int element){

        //���鵽������ʱ������
        if(arrayIndex > array.length - 1){
            int[] array2 = new int[array.length * 2];
            array = array2;
        }
        array[arrayIndex] = element;
        arrayIndex++;
    }

    //ɾ��һ��Ԫ��
    public void delete(int elementIndex){

        if (judge(elementIndex)){
            for (int i = elementIndex; i < array.length - 1; i++) {
                array[elementIndex] = array[elementIndex + 1];
            }
            arrayIndex--;
        }

    }

    //����һ��Ԫ��
    public int find(int elementIndex){

        if (judge(elementIndex)){
            return array[elementIndex];
        }else {
            return -1;
        }


    }

    //�޸�һ��Ԫ��
    public void  alter(int element,int elementIndex){

        if (judge(elementIndex)) {
            array[elementIndex] = element;
        }
    }

    //������ʾ����
    public void arrarToString(){
        for (int i = 0; i < arrayIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean judge(int elementIndex){
        if (elementIndex<0 || elementIndex>arrayIndex){
            System.out.println("�±�["+elementIndex+"]������");
            return false;
        }
        return true;
    }

}
