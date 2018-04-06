package com.home.search;

import java.util.ArrayDeque;
import java.util.Deque;

public class BreadthFirstSearch extends NodeSearchCommon {

    private static Deque<String> queue = new ArrayDeque<>();

    public BreadthFirstSearch() {
        super(queue);
    }

    @Override
    public void addTo(String fromNode) {
        queue.add(fromNode);
    }
}
