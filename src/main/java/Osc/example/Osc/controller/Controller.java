package Osc.example.Osc.controller;


import Osc.example.Osc.model.CheckModel;
import Osc.example.Osc.model.DepartmentModel;
import Osc.example.Osc.model.EmployeeModel;
import Osc.example.Osc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fromkarthi")
public class Controller {

    @Autowired
    EmployeeService employeeservice;

    //getEmployee here
    @GetMapping("/getemployee")
    public List<EmployeeModel> getEmployee()
    {
        return employeeservice.getemployee();
    }


    //add employee data here

    @PostMapping("/postemployee")
    public String addEmployee(@RequestBody EmployeeModel employee)
    {
        System.out.println("data recived" + employee.getEmpName());
        System.out.println("Id recived" + employee.getEmpId());

        employeeservice.addemployee(employee);
        return "Employee details added...";
    }

    //get department here
    @GetMapping("/getdepartment")
    public List<DepartmentModel> getdepartment()
    {
        return employeeservice.getdepartment();
    }

    //post department data here
    @PostMapping("/postdepartment")
    public String addDepartment(@RequestBody DepartmentModel department)
    {
        System.out.println("check recived or not" + department.getDeptName());
        return employeeservice.addDepartment(department);
    }






//    @GetMapping("/getcheck")
//    public List<CheckModel> getcheck()
//    {
//        return employeeservice.getCheck();
//    }

//    @PostMapping("/postcheck")
//    public String postcheck(@RequestBody CheckModel checking)
//    {
//        employeeservice.postCheck(checking);
//        System.out.println("checkingg" + checking.getGender());
//        return "checked succesefully";
//    }

}
