package Osc.example.Osc.controller;


import Osc.example.Osc.model.CheckModel;
import Osc.example.Osc.model.EmployeeDemo;
import Osc.example.Osc.service.EmployeeDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fromkarthi")
public class Controller {

    @Autowired
    EmployeeDemoService employeeser;


    //following below code for checking purpose(it has minimum fields or small table)
    @GetMapping("/getcheck")
    public List<CheckModel> getcheck()
    {
        return employeeser.getCheck();
    }

    @PostMapping("/postcheck")
    public String postcheck(@RequestBody CheckModel checking)
    {
        employeeser.postCheck(checking);
        System.out.println("checkingg" + checking.getGender());
        return "checked succesefully";
    }

}
