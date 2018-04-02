package com.home.search;

import com.home.dto.EdgeDTO;

import java.util.List;

public interface NodeSearch {
    boolean isPathExists(String fromNode, String toNode, List<EdgeDTO> graphNodes);
}
