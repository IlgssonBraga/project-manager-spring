package com.example.project_api;
import DTOs.IProjectServiceDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class ProjectService implements IProjectServiceDTO {
    private static final List<Project> projects = new ArrayList<>();

    public List<Project> findAll() {
        return projects;
    }

    public void create(Project body) {

        projects.add(body);

    }
}