package com.home.search;

import com.home.dto.Edge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public abstract class NodeSearchCommon<T> implements NodeSearch<T> {

    @Override
    public boolean isPathExists(T fromNode, T toNode, List<Edge> graphNodes) {

        System.out.println("From node: " + fromNode + " To node: " + toNode);
        Set<T> visitedNodes = new HashSet<>();

        add(fromNode);

        while (!isEmpty()) {
            T currentNode = remove();

            if (currentNode.equals(toNode)) {
                return true;
            }

            if (isNodeVisited(visitedNodes, currentNode)) {
                continue;
            }

            visitedNodes.add(currentNode);
            System.out.println("======   " + currentNode);

            for (T neighbourNode : getNeighbourNodes(currentNode, graphNodes)) {
                add(neighbourNode);
            }
        }
        return false;
    }

    private boolean isNodeVisited(Set<T> visitedNodes, T currentNode) {
        return visitedNodes.contains(currentNode);
    }

    protected List<T> getNeighbourNodes(T node, List<Edge> routes) {
        return routes.stream().filter(route -> route.getFromNode().equals(node))
                .map(route -> (T) route.getToNode())
                .collect(toList());
    }

    protected abstract boolean isEmpty();

    protected abstract T remove();

    protected abstract void add(T node);
}
