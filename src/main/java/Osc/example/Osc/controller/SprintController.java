package Osc.example.Osc.controller;


import Osc.example.Osc.model.Responses;
import Osc.example.Osc.model.SprintModel;
import Osc.example.Osc.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sprint")
@CrossOrigin(origins = "*")
public class SprintController {

    @Autowired
    SprintService sprintservice;


    @PostMapping("/postSprint")
    public String postSprint(@RequestBody SprintModel sprint)
    {
        sprintservice.postSprint(sprint);
        return "Sprint posted";
    }


    @GetMapping("/getSprint")
    public List<SprintModel> getSprint(@RequestParam(required = false) String sprintId)
//                                       @RequestParam(required = false) String sprintName)
    {
       return sprintservice.sprintGet(sprintId);
    }

    @GetMapping("/sprintStatus")
    public ResponseEntity<Responses> getSprintStatus(@RequestParam String status , String projectId)
    {
        return sprintservice.springStatusGet(status, projectId);
    }
}
