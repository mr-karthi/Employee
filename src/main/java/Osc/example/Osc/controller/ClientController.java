package Osc.example.Osc.controller;
import Osc.example.Osc.model.ClientModel;
import Osc.example.Osc.model.Responses;
import Osc.example.Osc.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/client")
public class ClientController {


    @Autowired
    ClientService clientservice;



@GetMapping("/getclient")
public ResponseEntity<Responses> getClient()
{
    return clientservice.getClient();
}

    //post client data here
    @PostMapping("/postclient")
    public ResponseEntity<Responses> post(@RequestBody ClientModel client)
    {
      return   clientservice.clientPost(client);

    }
}
