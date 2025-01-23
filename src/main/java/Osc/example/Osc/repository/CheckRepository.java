package Osc.example.Osc.repository;


import Osc.example.Osc.model.CheckModel;
import Osc.example.Osc.model.EmployeeDemo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CheckRepository  extends JpaRepository<CheckModel , Long>{

    static void save(EmployeeDemo checkfile) {

    }

}
