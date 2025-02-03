package Osc.example.Osc.service;


import Osc.example.Osc.model.Responses;
import Osc.example.Osc.model.TaskModel;
import Osc.example.Osc.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public ResponseEntity<Responses> taskPost(TaskModel task) {

        Responses taskres = new Responses();

        try {
            TaskModel posttask = taskRepository.save(task);
            taskres.setPostData(posttask);
            taskres.setStatus("Success");
            return new ResponseEntity<>(taskres, HttpStatus.CREATED);

        } catch (Exception e) {
            taskres.setResponseMessage("Error occurred" + e.getMessage());
            return new ResponseEntity<>(taskres, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    public List<TaskModel> taskGet(String taskId) {
        try {

            if (taskId != null){

                return taskRepository.findBytaskId(taskId);
            }
            else {
                return taskRepository.findAll();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ResponseEntity<Responses> statusGet(String status, String sprintId) {

        Responses res = new Responses();
        try {
            List<TaskModel> taskStatus = taskRepository.findBySprintIdAndStatus(sprintId,status);
            if (sprintId != null && status !=null)
            {
                res.setData(taskStatus);
                res.setStatus("Success");
            } else if (status != null) {

                res.setData(taskRepository.findByStatus(status));
                res.setStatus("Success");
            }else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(res);
    }
}
