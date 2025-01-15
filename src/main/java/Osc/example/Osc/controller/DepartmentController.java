package Osc.example.Osc.controller;
import Osc.example.Osc.model.DepartmentModel;
import Osc.example.Osc.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/department")
public class DepartmentController {


@Autowired
    DepartmentService departmentservice;


    //get department here
    @GetMapping("/getdepartment")
    public List<DepartmentModel> getdepartment()
    {
      return  departmentservice.getdepartment();

    }


    //post department data here
    @PostMapping("/postdepartment")
    public String postdepartments(@RequestBody DepartmentModel department)
    {
        departmentservice.postdepartments(department);
        return  "Department posted";
    }


}
