package Osc.example.Osc.repository;


import Osc.example.Osc.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;


//employee repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel , String>{
}
