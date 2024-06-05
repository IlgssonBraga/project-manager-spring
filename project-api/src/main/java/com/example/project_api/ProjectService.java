package com.example.project_api;
import DTOs.IProjectServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class ProjectService implements IProjectServiceDTO {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAll() {
        return this.projectRepository.findAll();
    }

    public List<Project> findById(Long id) {

        Optional<Project> projectOptional = projectRepository.findById(id);
        return projectOptional.map(Collections::singletonList).orElse(Collections.emptyList());

    }

    public void deleteById(Long id) {

        this.projectRepository.deleteById(id);

    }

    public void save(Project project) {

        this.projectRepository.save(project);

    }
}