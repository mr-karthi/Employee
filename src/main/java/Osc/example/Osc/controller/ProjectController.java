package Osc.example.Osc.controller;
import Osc.example.Osc.ProjectStatus;
import Osc.example.Osc.model.ProjectModel;
import Osc.example.Osc.model.Responses;
import Osc.example.Osc.service.ProjectService;
import org.springframework.data.domain.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "*")
public class ProjectController {



    @Autowired
    ProjectService projectservice;


    //get project here
    @GetMapping("/getproject")
    public Page<ProjectModel> getProects(  @RequestParam(required = false) String projectId,
                                           @RequestParam(required = false) String projectName,
                                           Pageable pageable)
    {

       return projectservice.getproject(pageable,projectId,projectName);
    }



    //post project data here
    @PostMapping("/postproject")
    public String post(@RequestBody ProjectModel project)
    {
       projectservice.post(project);
       return  "project posted";

    }

    @GetMapping("/active")
    public ResponseEntity<Responses> get(@RequestParam String status){
        return  projectservice.get(status);
    }


//    @GetMapping("/inactive")
//    public List<ProjectModel> getInActiveProjects()
//    {
//        return projectservice.getInActiveProjects(ProjectStatus.Inactive);
//    }


}


