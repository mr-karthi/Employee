package Osc.example.Osc.service;

import Osc.example.Osc.model.Responses;
import Osc.example.Osc.model.SprintModel;
import Osc.example.Osc.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintService {

    @Autowired
     SprintRepository sprintRepository;




    public  List<SprintModel> sprintGet(String sprintId, String sprintName) {
        if (sprintId != null && sprintName != null)
        {
          return  sprintRepository.findBySprintIdAndSprintName(sprintId,sprintName);
        }
        else if (sprintId != null)
        {

            return sprintRepository.findBySprintId(sprintId);
        }
        else if (sprintName != null)
        {

            return sprintRepository.findBySprintName(sprintName);
        }
        else {
            return sprintRepository.findAll();
        }
    }





    public ResponseEntity<Responses> postSprint(SprintModel sprint) {

        Responses sprintPostResponse = new Responses();

        try {

            SprintModel sprintPost = sprintRepository.save(sprint);
            sprintPostResponse.setPostData(sprintPost);
            sprintPostResponse.setStatus("Success");
            return new ResponseEntity<>(sprintPostResponse , HttpStatus.CREATED);
        } catch (Exception e) {
            sprintPostResponse.setResponseMessage("Error occurred"  + e.getMessage());
            return new ResponseEntity<>(sprintPostResponse , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Responses> springStatusGet(String status, String projectId) {

        Responses sprintStatusResponse = new Responses();

        try {
            List<SprintModel> sprintStatus = sprintRepository.findByProjectIdAndStatus(projectId,status);

            if (projectId != null && status != null){

                sprintStatusResponse.setData(sprintStatus);
                sprintStatusResponse.setStatus("Success");

            } else if (status != null) {

                sprintStatusResponse.setData(sprintRepository.findByStatus(status));
                sprintStatusResponse.setStatus("Success");
            }
            else {
                return null;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return ResponseEntity.ok(sprintStatusResponse);
    }
}
