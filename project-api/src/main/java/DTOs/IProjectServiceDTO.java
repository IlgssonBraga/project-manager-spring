package DTOs;

import com.example.project_api.Project;

import java.util.List;

public interface IProjectServiceDTO {
    List<Project> findAll();
    void create(Project body);
    List<Project> projects = List.of();
}
