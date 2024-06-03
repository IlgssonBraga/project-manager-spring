package com.example.project_api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class ProjectService {
    private static final List<Project> projects = new ArrayList<>();

    public enum Status {
        STARTED,
        NOT_STARTED,
        PENDING,
        COMPLETED
    }

    public List<Project> findAll() {
        return projects;
    }

    public void create(Project body) {

        projects.add(body);

    }
}