package com.home.search;

import java.util.ArrayDeque;
import java.util.Deque;

public class DepthFirstSearch<T> extends NodeSearchCommon<T> {

    private Deque<T> stack = new ArrayDeque<>();

    @Override
    protected boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    protected T remove() {
        return stack.pop();
    }

    @Override
    protected void add(T fromNode) {
        stack.push(fromNode);
    }
}
