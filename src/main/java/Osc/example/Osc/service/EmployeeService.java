package Osc.example.Osc.service;

import Osc.example.Osc.model.CheckModel;
import Osc.example.Osc.model.DepartmentModel;
import Osc.example.Osc.model.EmployeeModel;
import Osc.example.Osc.repository.CheckRepository;
import Osc.example.Osc.repository.DepartmentRepository;
import Osc.example.Osc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {



    @Autowired
    EmployeeRepository employeerepository;

    @Autowired
    DepartmentRepository departmentrepository;

//    @Autowired
//    CheckRepository checkrepo;



    //do servive for getEmployee here
    public List<EmployeeModel> getemployee()
    {

       return employeerepository.findAll();

    }


    //do service for postEmployee data here
    public ResponseEntity<?> addemployee(EmployeeModel employee)
    {
        employeerepository.save(employee);
        return new ResponseEntity<>("ok", HttpStatus.CREATED);
    }


    //do service for getDepartment data here
    public List<DepartmentModel> getdepartment()
    {
        return departmentrepository.findAll();

    }


    //do service for addDepartment data here
    public String addDepartment(DepartmentModel department)
    {
        departmentrepository.save(department);
        return "Department data added...";
    }


//    public List<CheckModel> getCheck() {
//       return  checkrepo.findAll();
//    }
//
//    public void postCheck(CheckModel checking) {
//        checkrepo.save(checking);
//    }


}
