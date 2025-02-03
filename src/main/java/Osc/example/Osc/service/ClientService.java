package Osc.example.Osc.service;

import Osc.example.Osc.model.ClientModel;
import Osc.example.Osc.model.Responses;
import Osc.example.Osc.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


//client service
@Service
public class ClientService {


    @Autowired
    ClientRepository clientrepository;




    //do service for post client data here
    public ResponseEntity<Responses> clientPost(ClientModel client)
    {
        Responses clientRes = new Responses();
        try {
            client.setCreatedBy("Admin");
            client.setCreatedOn(new Date());
            ClientModel postClient = clientrepository.save(client);
            clientRes.setPostData(postClient);
            clientRes.setStatus("success");
            return new ResponseEntity<>(clientRes, HttpStatus.CREATED);
        } catch (Exception e) {

            clientRes.setResponseMessage("Error occurred" + e.getMessage());
            return new ResponseEntity<>(clientRes, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    public ResponseEntity<Responses> getClient() {
        Responses getRes = new Responses();

        try {
            List<ClientModel> getClient = clientrepository.findAll();
            getRes.setData(getClient);
            getRes.setStatus("Success");
            return new ResponseEntity<>(getRes, HttpStatus.OK);
        } catch (Exception e) {

            getRes.setResponseMessage("Error occurred" + e.getMessage());
            return new ResponseEntity<>(getRes, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
