package Osc.example.Osc.service;


import Osc.example.Osc.ProjectStatus;
import Osc.example.Osc.model.ProjectModel;
import Osc.example.Osc.model.Responses;
import Osc.example.Osc.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;


//project service
@Service
public class ProjectService {


    @Autowired
    ProjectRepository projectrepository;





    //do service for get project here
    public Page<ProjectModel> getproject(Pageable pageable , String projectId)
    {

        System.out.println("the id" + projectId);

        try {

            if (projectId != null)
            {
                return projectrepository.findByProjectId(projectId,pageable);
            }
            else
            {

                return projectrepository.findAll(pageable);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }



    //do service for post project data here
    public ResponseEntity<Responses> post(ProjectModel project)
    {
            Responses postResponse = new Responses();

             try {
                 project.setCreatedBy("Admin");
                 project.setCreatedOn(new Date());
                 ProjectModel postProject = projectrepository.save(project);
                 postResponse.setPostData(postProject);
                 postResponse.setStatus("success");
                 return new ResponseEntity<>(postResponse, HttpStatus.CREATED);

             } catch(Exception e) {
                 postResponse.setResponseMessage("Error occurred" + e.getMessage());
                 return new ResponseEntity<>(postResponse, HttpStatus.INTERNAL_SERVER_ERROR);
             }

    }


    //do service for handle project status
    public ResponseEntity<Responses> get(String status) {
        Responses res = new Responses();
        try {

              List<ProjectModel> projectStatus = projectrepository.findByStatus(status);
              res.setData(projectStatus);
              res.setStatus("success");
        } catch(Exception e) {

            throw new RuntimeException(e);
        }
       return ResponseEntity.ok(res);
    }



    public ResponseEntity<Responses> filterData(String projectName) {
        Responses res = new Responses();
       List<ProjectModel> checkData = projectrepository.filterCheck(projectName);

        res.setData(checkData);
        return ResponseEntity.ok(res);
    }


//    public ResponseEntity<Responses> get(String status){
//        Responses responses = new Responses();
//
//            if (status.equals(ProjectStatus.Active)) {
//                List<ProjectModel> statusFromDbActive = projectrepository.findByStatus(ProjectStatus.Active);
//                responses.setData(statusFromDbActive);
//                responses.setStatus("success");
//
//
//            } else if (status.equals(ProjectStatus.Inactive)) {
//                List<ProjectModel> statusFromDbInActive = projectrepository.findByStatus(ProjectStatus.Inactive);
//                responses.setData(statusFromDbInActive);
//                responses.setStatus("success");
//
//            } else if (status.equals(ProjectStatus.Completed)) {
//
//                List<ProjectModel> statusFromDbComplete = projectrepository.findByStatus(ProjectStatus.Completed);
//                responses.setData(statusFromDbComplete);
//                responses.setStatus("success");
//
//            }
//
//        return  ResponseEntity.ok(responses);
//
//
//    }
}