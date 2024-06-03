package com.example.project_api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/")
public class ProjectController {
    private final ProjectService projectService;

    ProjectController(ProjectService projectService ){
        this.projectService = new ProjectService();
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return this.projectService.findAll();
    }

    @PostMapping("/projects")
    public Project addProjects(@RequestBody Project body) {

        this.projectService.create(body);

        return body;
    }
}