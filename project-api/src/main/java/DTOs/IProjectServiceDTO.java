package DTOs;

import com.example.project_api.Project;

import java.util.List;

public interface IProjectServiceDTO {
    List<Project> findAll();
    void save(Project body);
    List<Project> findById(Long id);
    void deleteById(Long id);
}
