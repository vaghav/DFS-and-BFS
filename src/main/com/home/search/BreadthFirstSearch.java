package com.home.search;

import java.util.ArrayDeque;
import java.util.Deque;

public class BreadthFirstSearch<T> extends NodeSearchCommon<T> {

    private Deque<T> queue = new ArrayDeque<>();

    @Override
    protected boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    protected T remove() {
        return queue.remove();
    }

    @Override
    public void add(T fromNode) {
        queue.add(fromNode);
    }
}
