package com.home.search;

import com.home.dto.EdgeDTO;

import java.util.*;

import static java.util.stream.Collectors.toSet;

public abstract class NodeSearchCommon implements NodeSearch {

    @Override
    public boolean isPathExists(String fromNode, String toNode, List<EdgeDTO> graphNodes) {

        System.out.println("From node: " + fromNode + " To node: " + toNode);
        Set<String> visitedNodes = new HashSet<>();

        Deque<String> nodeQueue = new ArrayDeque<>();
        addTo(fromNode, nodeQueue);

        while (!nodeQueue.isEmpty()) {
            String currentNode = removeFrom(nodeQueue);

            if (currentNode.equals(toNode)) {
                System.out.println("Found path to: " + toNode);
                return true;
            }

            visitNeighbourNodes(graphNodes, visitedNodes, nodeQueue, currentNode);
        }
        return false;
    }

    protected Set<String> getNeighbourNodes(String airport, List<EdgeDTO> routes) {
        return routes.stream().filter(route -> route.getFromNode().equals(airport))
                .map(route -> route.getToNode())
                .collect(toSet());
    }

    protected abstract void addTo(String node, Deque<String> nodeQueue);

    protected abstract String removeFrom(Deque<String> nodeQueue);

    protected abstract void visitNeighbourNodes(List<EdgeDTO> graphNodes, Set<String> visitedNodes,
                                                Deque<String> nodeQueue, String retrievedNode);
}
