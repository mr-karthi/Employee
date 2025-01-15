package Osc.example.Osc.repository;


import Osc.example.Osc.model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;


//department repository
public interface DepartmentRepository extends JpaRepository<DepartmentModel, Long>{


}
