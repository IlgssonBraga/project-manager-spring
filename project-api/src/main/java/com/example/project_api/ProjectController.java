package com.example.project_api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class ProjectController {
    private final ProjectService projectService;

    ProjectController(ProjectService projectService ){
        this.projectService = new ProjectService();
    }

    public List<Project> getProjects() {
        return this.projectService.findAll();
    }

    public Project addProjects(Project body) {

        this.projectService.create(body);

        return body;
    }
}