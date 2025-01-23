package Osc.example.Osc.repository;


import Osc.example.Osc.model.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//module repository
@Repository
public interface ModuleRepository extends JpaRepository<ModuleModel , String> {
}
