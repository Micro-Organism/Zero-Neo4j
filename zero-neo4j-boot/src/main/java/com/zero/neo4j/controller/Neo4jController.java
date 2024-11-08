package com.zero.neo4j.controller;

import com.zero.neo4j.domain.entity.Relation;
import com.zero.neo4j.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Neo4jController {

    @Autowired
    private NodeService nodeService;

    @GetMapping("parse")
    @ResponseBody
    public List<Relation> parse(String sentence) {
        return nodeService.parseAndBind(sentence);
    }
}