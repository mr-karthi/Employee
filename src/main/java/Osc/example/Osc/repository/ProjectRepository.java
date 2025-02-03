package Osc.example.Osc.repository;


import Osc.example.Osc.ProjectStatus;
import Osc.example.Osc.model.ProjectModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectModel, String> {

    Page<ProjectModel> findByProjectIdAndProjectName(String projectId, String projectName, Pageable pageable);

    Page<ProjectModel> findByProjectId(String projectId, Pageable pageable);

    Page<ProjectModel> findByProjectName(String projectName, Pageable pageable);

    List<ProjectModel> findByStatus(String status);

    @Query(value = "select * from project_table where project_name like 'i%'" , nativeQuery = true)
    List<ProjectModel>filterCheck(String projectName);
}
