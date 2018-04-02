package com.home.search;

import com.home.dto.EdgeDTO;

import java.util.Deque;
import java.util.List;
import java.util.Set;

public class BreadthFirstSearch extends NodeSearchCommon {

    @Override
    public void visitNeighbourNodes(List<EdgeDTO> graphNodes, Set<String> visitedNodes, Deque<String> nodeQueue,
                                    String currentNode) {

        for (String neighbourNode : getNeighbourNodes(currentNode, graphNodes)) {
            if (!visitedNodes.contains(neighbourNode)) {
                nodeQueue.add(neighbourNode);
                visitedNodes.add(neighbourNode);
                System.out.println("======== " + neighbourNode);
            }
        }
    }

    public void addTo(String fromNode, Deque<String> nodeQueue) {
        nodeQueue.add(fromNode);
    }

    public String removeFrom(Deque<String> nodeQueue) {
        return nodeQueue.remove();
    }
}
