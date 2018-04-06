package com.home.search;

import com.home.dto.EdgeDTO;

import java.util.*;

import static java.util.stream.Collectors.toSet;

public abstract class NodeSearchCommon implements NodeSearch {

    private Deque<String> nodeQueue;

    public NodeSearchCommon(Deque<String> nodeQueue) {
        this.nodeQueue = nodeQueue;
    }

    @Override
    public boolean isPathExists(String fromNode, String toNode, List<EdgeDTO> graphNodes) {

        System.out.println("From node: " + fromNode + " To node: " + toNode);
        Set<String> visitedNodes = new HashSet<>();

        addTo(fromNode);

        while (!nodeQueue.isEmpty()) {
            String currentNode = nodeQueue.remove();

            if (isNodeVisited(visitedNodes, currentNode)) {
                continue;
            }

            visitedNodes.add(currentNode);
            System.out.println("======   " + currentNode);

            if (currentNode.equals(toNode)) {
                return true;
            }

            for (String neighbourNode : getNeighbourNodes(currentNode, graphNodes)) {
                addTo(neighbourNode);
            }
        }
        return false;
    }

    private boolean isNodeVisited(Set<String> visitedNodes, String currentNode) {
        return visitedNodes.contains(currentNode);
    }

    protected Set<String> getNeighbourNodes(String airport, List<EdgeDTO> routes) {
        return routes.stream().filter(route -> route.getFromNode().equals(airport))
                .map(route -> route.getToNode())
                .collect(toSet());
    }

    protected abstract void addTo(String node);
}
