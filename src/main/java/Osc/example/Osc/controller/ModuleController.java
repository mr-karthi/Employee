package Osc.example.Osc.controller;
import Osc.example.Osc.model.ModuleModel;
import Osc.example.Osc.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/module")
public class ModuleController {



    @Autowired
    ModuleService moduleservice;


    //get module here
    @GetMapping("/getmodule")
    public List<ModuleModel> getmodule()
    {
        return moduleservice.getmodule();
    }


    //post module data here
    @PostMapping("/postmodule")
    public String postmodule(@RequestBody ModuleModel module)
    {
        moduleservice.postmodule(module);
        return "Module posted";
    }
}
