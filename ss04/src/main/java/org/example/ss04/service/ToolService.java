package org.example.ss04.service;

import org.example.ss04.model.Tool;
import org.example.ss04.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolService {

    // constructors
    private final ToolRepository toolRepository;

    @Autowired
    public ToolService(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }


    // setter

    // field


    public List<Tool> getAllTool() {
        return toolRepository.findAll();
    }

}
