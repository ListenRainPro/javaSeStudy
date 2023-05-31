package com.xuan;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/17 20:14
 * @introduction:
 */
public class SuperLink {

    //创建链表头
    private Node head;

    //创建链表计数
    private int nodeIndex = -1;

    //添加一个元素
    public void add(int data){
        if (nodeIndex == -1){

            head = new Node(data,null);
        }else {

            //创建一个指向头部的node
            Node node = new Node(data,head);
            //让新的node变成头
            head = node;
        }
        nodeIndex++;
    }

    //指定位置插入node
    public void add(int index,int data){
        if (index == 0){

            add(data);
        }else {

            Node node = head;
            for (int i = 0; i < index -1 ; i++) {

                node = node.getNode();

            }

            Node node1 = new Node(data, node.getNode());
            node.setNode(node1);
        }
        nodeIndex++;
    }

    //删除一个元素
    public void delete(int index){

        Node node = head;
        for (int i = 0; i < index -1 ; i++) {

            node = node.getNode();
        }

        //删除node
        node.setNode(node.getNode().getNode());
        nodeIndex--;

    }
    //查找一个元素
    public Integer find(int index){

        Node node = head;
        for (int i = 0; i < index ; i++) {

            node = node.getNode();
        }
        return node.getData();
    }

    public Node findNode(int index){

        Node node = head;
        for (int i = 0; i < index; i++) {

            node = node.getNode();
        }
        return node;
    }


    //修改一个元素
    public void alter(int index , int data){

        Node node = head;
        for (int i = 0; i < index; i++) {

            node = node.getNode();
        }
        node.setData(data);
    }

    //遍历输出链表
    public String linkToString(){

        String result = "[";
        Node node = head;
        for (int i = 0; i <= nodeIndex; i++) {

            result += node.getData() + ",";
            node = node.getNode();

        }

        return result.substring(0,result.length()-1)+"]";

    }

    //排序
    public void sort(){
        for (int i = 0; i < nodeIndex; i++) {
            for (int j = 0; j < nodeIndex-i; j++) {

                if (find(j) > find(j+1)) {
                    int temp = find(j);
                    findNode(j).setData(find(j+1));
                    findNode(j+1).setData(temp);

                }
            }
        }
    }
    public void sort2(){
        for (int i = 0; i < nodeIndex; i++) {
            for (int j = 0; j < nodeIndex-i; j++) {

                Node node = findNode(j);
                Node next = node.getNode();
                if (node.getData() > next.getData()) {
                    int temp = node.getData();
                    node.setData(next.getData());
                    next.setData(temp);

                }
            }
        }
    }

    public void sort3(){
        for (int i = 0; i < nodeIndex; i++) {
            Node node = null;
            for (int j = 0; j < nodeIndex-i; j++) {

                if (j == 0 ){
                    node = head;
                }else {
                    node = node.getNode();
                }
                Node next = node.getNode();
                if (node.getData() > next.getData()) {
                    int temp = node.getData();
                    node.setData(next.getData());
                    next.setData(temp);

                }
            }
        }
    }


}
