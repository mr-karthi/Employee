package Osc.example.Osc.service;

import Osc.example.Osc.model.CheckModel;
import Osc.example.Osc.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class EmployeeDemoService {


    //checking purpose
    @Autowired
    CheckRepository checkrepo;


    //following below code for checking purpose(it has minimum fields & small table)
    public List<CheckModel> getCheck() {
        return checkrepo.findAll();
    }

    public void postCheck(CheckModel checking) {
        checkrepo.save(checking);
    }



}