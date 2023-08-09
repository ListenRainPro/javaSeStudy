package com.xuan.array;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/17 20:14
 * @introduction:
 */
public class SuperLink {

    //��������ͷ
    private Node head;

    //�����������
    private int nodeIndex = -1;

    //���һ��Ԫ��
    public void add(int data){
        if (nodeIndex == -1){

            head = new Node(data,null);
        }else {

            //����һ��ָ��ͷ����node
            Node node = new Node(data,head);
            //���µ�node���ͷ
            head = node;
        }
        nodeIndex++;
    }

    //ָ��λ�ò���node
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

    //ɾ��һ��Ԫ��
    public void delete(int index){

        Node node = head;
        for (int i = 0; i < index -1 ; i++) {

            node = node.getNode();
        }

        //ɾ��node
        node.setNode(node.getNode().getNode());
        nodeIndex--;

    }
    //����һ��Ԫ��
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


    //�޸�һ��Ԫ��
    public void alter(int index , int data){

        Node node = head;
        for (int i = 0; i < index; i++) {

            node = node.getNode();
        }
        node.setData(data);
    }

    //�����������
    public String linkToString(){

        String result = "[";
        Node node = head;
        for (int i = 0; i <= nodeIndex; i++) {

            result += node.getData() + ",";
            node = node.getNode();

        }

        return result.substring(0,result.length()-1)+"]";

    }

    //����
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
