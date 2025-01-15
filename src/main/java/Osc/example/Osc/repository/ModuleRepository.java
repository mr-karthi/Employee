package Osc.example.Osc.repository;


import Osc.example.Osc.model.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;


//module repository
public interface ModuleRepository extends JpaRepository<ModuleModel , String> {
}
