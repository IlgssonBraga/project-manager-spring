package com.example.project_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return this.projectService.findAll();
    }

    @PostMapping("/projects")
    public Project addProjects(@RequestBody Project project) {

        this.projectService.create(project);

        return project;
    }
}