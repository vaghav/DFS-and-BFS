package com.home.dto;

public class Edge<T> {

    private T fromNode;

    private T toNode;

    public Edge(T fromNode, T toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    public T getFromNode() {
        return fromNode;
    }

    public T getToNode() {
        return toNode;
    }
}
