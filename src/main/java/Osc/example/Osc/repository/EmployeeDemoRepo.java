package Osc.example.Osc.repository;


import Osc.example.Osc.model.EmployeeDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDemoRepo extends JpaRepository<EmployeeDemo, Long >  {


}


