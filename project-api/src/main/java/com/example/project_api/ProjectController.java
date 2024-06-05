package com.example.project_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/projects/{id}")
    public List<Project> getProject(@PathVariable Long id) {
        return this.projectService.findById(id);
    }

    @DeleteMapping("/projects/{id}")
    public void deleteProject(@PathVariable Long id) {
        this.projectService.deleteById(id);
    }

    @PostMapping("/projects")
    public Project addProjects(@RequestBody Project project) {

        this.projectService.save(project);

        return project;
    }

    @PutMapping("/projects/{id}")
    public Project updateProjects(@PathVariable Long id, @RequestBody Project project) {
        project.setId(id);
        this.projectService.save(project);

        return project;
    }
}