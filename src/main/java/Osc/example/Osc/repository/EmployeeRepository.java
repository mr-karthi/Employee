package Osc.example.Osc.repository;


import Osc.example.Osc.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//employee repository
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel , String>{
}
