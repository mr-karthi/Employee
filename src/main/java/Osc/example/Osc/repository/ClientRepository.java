package Osc.example.Osc.repository;


import Osc.example.Osc.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;


//client repository
public interface ClientRepository extends JpaRepository<ClientModel , String> {


}
