package Osc.example.Osc.repository;

import Osc.example.Osc.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long >  {


}


