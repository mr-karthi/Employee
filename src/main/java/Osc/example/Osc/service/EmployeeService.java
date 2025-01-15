package Osc.example.Osc.service;

import Osc.example.Osc.model.EmployeeModel;
import Osc.example.Osc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;


//Employee service
@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeerepository;


    //do service for get employee here
    public List<EmployeeModel> getemp()
    {

      return  employeerepository.findAll();

    }


    //do service for post employee data here
    public void postemp(EmployeeModel employees)
    {

        employeerepository.save(employees);

    }
}
