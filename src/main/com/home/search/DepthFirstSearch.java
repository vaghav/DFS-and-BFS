package com.home.search;

import com.home.dto.EdgeDTO;

import java.util.Deque;
import java.util.List;
import java.util.Set;

public class DepthFirstSearch extends NodeSearchCommon {

    @Override
    public void visitNeighbourNodes(List<EdgeDTO> graphNodes, Set<String> visitedNodes, Deque<String> nodeStack,
                                    String currentNode) {

        if (!visitedNodes.contains(currentNode)) {
            visitedNodes.add(currentNode);
            System.out.println("======== " + currentNode);

            for (String neighbourNode : getNeighbourNodes(currentNode, graphNodes)) {
                nodeStack.push(neighbourNode);
            }
        }
    }

    @Override
    protected void addTo(String fromNode, Deque<String> nodeQueue) {
        nodeQueue.push(fromNode);
    }

    @Override
    protected String removeFrom(Deque<String> nodeQueue) {
        return nodeQueue.pop();
    }
}
