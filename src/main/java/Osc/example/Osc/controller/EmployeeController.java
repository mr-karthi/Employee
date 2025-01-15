package Osc.example.Osc.controller;
import Osc.example.Osc.model.EmployeeModel;
import Osc.example.Osc.service.EmployeeDemoService;
import Osc.example.Osc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("employee")
public class EmployeeController {



    @Autowired
    EmployeeService employeeservice;


    //get employee here
    @GetMapping("/getemployee")
    public List<EmployeeModel> getemployee()
    {
      return  employeeservice.getemp();

    }


    //post employee data here
    @PostMapping("/postemployee")
    public String postemployees(@RequestBody EmployeeModel employees)
    {
        employeeservice.postemp(employees);
        return "Employee posted";
    }
}
