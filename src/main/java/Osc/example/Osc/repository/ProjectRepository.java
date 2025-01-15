package Osc.example.Osc.repository;


import Osc.example.Osc.model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;


//project repository
public interface ProjectRepository extends JpaRepository<ProjectModel, String> {
}
