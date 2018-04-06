package com.home.search;

import java.util.ArrayDeque;
import java.util.Deque;

public class DepthFirstSearch extends NodeSearchCommon {

    private static Deque<String> stack = new ArrayDeque<>();

    public DepthFirstSearch() {
        super(stack);
    }

    @Override
    protected void addTo(String fromNode) {
        stack.push(fromNode);
    }
}
