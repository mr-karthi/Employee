package Osc.example.Osc.controller;
import Osc.example.Osc.model.ClientModel;
import Osc.example.Osc.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/client")
public class ClientController {


    @Autowired
    ClientService clientservice;


    //get client here
    @GetMapping("/getclient")
    public List<ClientModel> getclient()
    {
        return  clientservice.getclient();
    }


    //post client data here
    @PostMapping("/postclient")
    public String postclient(@RequestBody ClientModel client)
    {
        clientservice.postclient(client);
        return  "client posted";
    }
}
