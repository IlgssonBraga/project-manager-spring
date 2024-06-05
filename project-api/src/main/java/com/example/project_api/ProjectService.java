package com.example.project_api;
import DTOs.IProjectServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Controller
@RestController
public class ProjectService implements IProjectServiceDTO {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAll() {
        return this.projectRepository.findAll();
    }

    public void create(Project project) {

        this.projectRepository.save(project);

    }
}