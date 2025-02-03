package Osc.example.Osc.controller;

import Osc.example.Osc.model.Responses;
import Osc.example.Osc.model.TaskModel;
import Osc.example.Osc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    TaskService taskService;


    @PostMapping("/postTask")
    public String postTask(@RequestBody TaskModel task)
    {
        taskService.taskPost(task);

        return "task posted";

    }

    @GetMapping("/getTask")
    public List<TaskModel> getTask(@RequestParam(required = false) String taskId)
    {
        return taskService.taskGet(taskId);
    }

    @GetMapping("/taskStatus")
    public ResponseEntity<Responses> getTaskStatus(@RequestParam String status, String sprintId
                                                    )
    {
        return taskService.statusGet(status,sprintId);
    }
}
