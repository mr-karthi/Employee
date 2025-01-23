package Osc.example.Osc.repository;

import Osc.example.Osc.model.SprintModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SprintRepository extends JpaRepository<SprintModel, String> {

    List<SprintModel> findBySprintIdAndSprintName(String sprintId, String sprintName);
    List<SprintModel> findBySprintId(String sprintId);
    List<SprintModel> findBySprintName(String sprintName);
    List<SprintModel> findByStatus(String status);

    List<SprintModel> findByProjectIdAndStatus(String projectId, String status);
}
