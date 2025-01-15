package Osc.example.Osc.controller;
import Osc.example.Osc.model.ProjectModel;
import Osc.example.Osc.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/project")
public class ProjectController {



    @Autowired
    ProjectService projectservice;


    //get project here
    @GetMapping("/getproject")
    public List<ProjectModel> getproject()
    {
       return projectservice.getproject();
    }


    //post project data here
    @PostMapping("/postproject")
    public String postproject(@RequestBody ProjectModel project)
    {
       projectservice.postproject(project);
       return  "project posted";
    }
}
