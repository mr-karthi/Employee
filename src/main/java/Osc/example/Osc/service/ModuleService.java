package Osc.example.Osc.service;

import Osc.example.Osc.model.ModuleModel;
import Osc.example.Osc.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//Module service
@Service
public class ModuleService {


    @Autowired
    ModuleRepository modulerepository;


    //do service for get module here
    public List<ModuleModel> getmodule()
    {

      return  modulerepository.findAll();

    }

    //do service for post module data here
    public void postmodule(ModuleModel module)
    {

        modulerepository.save(module);

    }
}
