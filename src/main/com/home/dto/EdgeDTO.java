package com.home.dto;

public class EdgeDTO {

    private String fromNode;

    private String toNode;

    public EdgeDTO(String fromNode, String toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    public String getFromNode() {
        return fromNode;
    }

    public String getToNode() {
        return toNode;
    }
}
