package Osc.example.Osc.service;

import Osc.example.Osc.model.ClientModel;
import Osc.example.Osc.model.ProductModel;
import Osc.example.Osc.model.Responses;
import Osc.example.Osc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ProductService {

@Autowired
    ProductRepository productRepository;


    public ResponseEntity<Responses> getProduct() {

        Responses res = new Responses();

        try {
            List<ProductModel> getProduct = productRepository.findAll();
            res.setData(getProduct);
            res.setStatus("success");
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            res.setResponseMessage("Error Occurred" + e.getMessage());
            return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Responses> postProduct(ProductModel product) {

        Responses res = new Responses();
        try {
            product.setCreatedBy("Admin");
            product.setCreatedOn(new Date());
            ProductModel postClient = productRepository.save(product);
            res.setPostData(postClient);
            res.setStatus("success");
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {

            res.setResponseMessage("Error occurred" + e.getMessage());
            return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
