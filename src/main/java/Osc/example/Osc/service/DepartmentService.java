package Osc.example.Osc.service;

import Osc.example.Osc.model.DepartmentModel;
import Osc.example.Osc.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//department service
@Service
public class DepartmentService {


    @Autowired
    DepartmentRepository departmentrepository;


    //do service for get department here
    public List<DepartmentModel> getdepartment()
    {

       return departmentrepository.findAll();

    }


    //do service for post department data here
    public void postdepartments(DepartmentModel department)
    {
        departmentrepository.save(department);

    }


}
