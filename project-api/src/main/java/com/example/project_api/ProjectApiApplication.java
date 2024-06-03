package com.example.project_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class ProjectApiApplication {

	@Autowired
	private ProjectController projectController;

    public ProjectApiApplication(ProjectController projectController) {
        this.projectController = projectController;
    }

    public static void main(String[] args) {
		SpringApplication.run(ProjectApiApplication.class, args);
	}

	@PostMapping("/projects")
	public Project postProjects(@RequestBody Project body) {
		return projectController.addProjects(body);
	}

	@GetMapping("/projects")
	public List<Project> getProjects() {
		return projectController.getProjects();
	}


}