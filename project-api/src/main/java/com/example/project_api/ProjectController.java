package com.example.project_api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class ProjectController {
    private static final List<Project> projects = new ArrayList<>();
    public List<Project> getProjects() {
        return projects;
    }

    public Project addProjects(Project body) {

        projects.add(body);

        return body;
    }

    public static class Project {
        private String title;

        public Project() {
        }

        public Project(String title) {
            this.title = title;
        }


        public String getTitle() {
            return title;
        }


        public void setTitle(String title) {
            this.title = title;
        }
    }
}