package Osc.example.Osc.repository;


import Osc.example.Osc.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//client repository
@Repository
public interface ClientRepository extends JpaRepository<ClientModel , String> {


}
