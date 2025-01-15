package Osc.example.Osc.service;


import Osc.example.Osc.model.ProjectModel;
import Osc.example.Osc.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//project service
@Service
public class ProjectService {


    @Autowired
    ProjectRepository projectrepository;


    //do service for get project here
    public List<ProjectModel> getproject()
    {

      return  projectrepository.findAll();

    }


    //do service for post project data here
    public void postproject(ProjectModel project)
    {

        projectrepository.save(project);

    }
}
