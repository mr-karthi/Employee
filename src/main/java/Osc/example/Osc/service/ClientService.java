package Osc.example.Osc.service;

import Osc.example.Osc.model.ClientModel;
import Osc.example.Osc.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//client service
@Service
public class ClientService {


    @Autowired
    ClientRepository clientrepository;


    //do service for get client here
    public List<ClientModel> getclient()
    {
        return clientrepository.findAll();
    }

    //do service for post client data here
    public void postclient(ClientModel client)
    {
        clientrepository.save(client);
    }
}
