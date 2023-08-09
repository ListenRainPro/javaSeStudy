package com.xuan.array;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/5/17 20:14
 * @introduction:
 */
public class Node {
    private Integer data;
    private Node node;

    public Node() {

    }

    public Node(Integer data, Node node) {
        this.data = data;
        this.node = node;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
