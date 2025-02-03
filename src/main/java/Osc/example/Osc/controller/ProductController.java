package Osc.example.Osc.controller;


import Osc.example.Osc.model.ProductModel;
import Osc.example.Osc.model.Responses;
import Osc.example.Osc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController{

    @Autowired
    ProductService productService;

    @PostMapping("/postproduct")
    public ResponseEntity<Responses> postProduct(@RequestBody ProductModel product)
    {
        return productService.postProduct(product);
    }

    @GetMapping("/getproduct")
    public ResponseEntity<Responses> getProduct()
    {
        return productService.getProduct();
    }
}
