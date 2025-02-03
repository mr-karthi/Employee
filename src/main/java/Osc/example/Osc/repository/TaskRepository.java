package Osc.example.Osc.repository;


import Osc.example.Osc.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, String> {

   List<TaskModel> findBytaskId(String taskId);

   List<TaskModel> findByStatus(String status);

   List<TaskModel> findBySprintIdAndStatus(String sprintId, String status);


}
