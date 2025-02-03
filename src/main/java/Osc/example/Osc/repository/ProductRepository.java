package Osc.example.Osc.repository;

import Osc.example.Osc.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, String> {


}
