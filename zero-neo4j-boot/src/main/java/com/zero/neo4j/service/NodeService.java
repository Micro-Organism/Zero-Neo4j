package com.zero.neo4j.service;

import com.zero.neo4j.domain.entity.Node;
import com.zero.neo4j.domain.entity.Relation;

import java.util.List;

public interface NodeService {
    Node save(Node node);
    void bind(String name1, String name2, String relationName);
    List<Relation> parseAndBind(String sentence);
}
