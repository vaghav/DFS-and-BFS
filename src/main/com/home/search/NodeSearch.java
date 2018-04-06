package com.home.search;

import com.home.dto.Edge;

import java.util.List;

public interface NodeSearch<T> {
    boolean isPathExists(T fromNode, T toNode, List<Edge> graphNodes);
}
