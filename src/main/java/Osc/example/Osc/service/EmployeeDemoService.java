package Osc.example.Osc.service;

import Osc.example.Osc.model.CheckModel;
import Osc.example.Osc.model.DepartmentModel;
import Osc.example.Osc.model.EmployeeDemo;
import Osc.example.Osc.repository.CheckRepository;
import Osc.example.Osc.repository.DepartmentRepository;
import Osc.example.Osc.repository.EmployeeDemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDemoService {



    //checking purpose
  @Autowired
    CheckRepository checkrepo;


//following below code for checking purpose(it has minimum fields & small table)
    public List<CheckModel> getCheck() {
       return  checkrepo.findAll();
    }

    public void postCheck(CheckModel checking) {
        checkrepo.save(checking);
    }


}
