package Osc.example.Osc.repository;


import Osc.example.Osc.model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//department repository
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentModel, Long>{


}
